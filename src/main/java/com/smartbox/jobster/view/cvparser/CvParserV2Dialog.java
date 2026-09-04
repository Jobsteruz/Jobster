package com.smartbox.jobster.view.cvparser;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.config.cvparser.CvParserAsyncConfig;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.VacancyState;
import com.smartbox.jobster.entity.hrm.VacancyStatus;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.service.cvparser.CvParserPersonMapper;
import com.smartbox.jobster.service.cvparser.ResumeParserService;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobResponse;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobStatus;
import com.smartbox.jobster.service.cvparser.dto.ResumeParserResponse;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.upload.FileUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Route(value = "cv-parser-v2-dialog", layout = MainView.class)
@ViewController("jb_CvParserV2Dialog")
@ViewDescriptor("cv-parser-v2-dialog.xml")
@DialogMode(width = "32em", height = "auto")
public class CvParserV2Dialog extends StandardView {

    private static final String WIDTH_INITIAL = "32em";
    private static final String WIDTH_REVIEW = "65em";

    private static final Logger log = LoggerFactory.getLogger(CvParserV2Dialog.class);
    private static final long POLL_INITIAL_DELAY_SEC = 2L;
    private static final long POLL_INTERVAL_SEC = 2L;
    private static final int MAX_CONSECUTIVE_POLL_FAILURES = 6;
    private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // Review row column widths (grid-like table). Value columns use flex (see buildValueSpan).
    private static final String COL_CHECKBOX_WIDTH = "1.8em";
    private static final String COL_BADGE_WIDTH = "6em";
    private static final String COL_LABEL_WIDTH = "10em";
    private static final String COL_ARROW_WIDTH = "1.5em";
    private static final String ROW_VPADDING = "0.4em 0.75em";

    // Apply failures are shown long enough to be read and screenshotted, and stay closeable so a
    // long technical detail can be dismissed without waiting the timeout out.
    private static final int APPLY_ERROR_DURATION_MS = 15_000;
    private static final int APPLY_ERROR_DETAIL_MAX = 300;

    /**
     * Failures {@link ResumeParserService} raises as stable codes rather than as incidents. These
     * get a translated sentence; anything else falls back to the root cause's own text.
     */
    private static final Set<String> KNOWN_ERROR_CODES = Set.of(
            ResumeParserService.ERR_ALREADY_PARSING,
            ResumeParserService.ERR_JOB_NOT_FOUND,
            ResumeParserService.ERR_JOB_NOT_READY,
            ResumeParserService.ERR_NO_PARSED_DATA,
            ResumeParserService.ERR_APPLICANT_MISMATCH,
            ResumeParserService.ERR_APPLICANT_NOT_ACCESSIBLE);

    @Autowired
    private ResumeParserService resumeParserService;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;
    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @Autowired
    @Qualifier(CvParserAsyncConfig.CV_PARSER_POLL_SCHEDULER)
    private TaskScheduler pollScheduler;

    @ViewComponent
    private EntityComboBox<Vacancy> vacancyField;
    @ViewComponent
    private JmixCheckbox skipPreviewCheck;
    @ViewComponent
    private FileUploadField cvFile;
    @ViewComponent
    private Span cvFileName;
    @ViewComponent
    private JmixButton startBtn;
    @ViewComponent
    private JmixButton applyBtn;
    @ViewComponent
    private JmixButton retryBtn;
    @ViewComponent
    private VerticalLayout statusBox;
    @ViewComponent
    private ProgressBar progressBar;
    @ViewComponent
    private Span statusLabel;
    @ViewComponent
    private VerticalLayout reviewSection;
    @ViewComponent
    private VerticalLayout fieldsContainer;
    @ViewComponent
    private Span selectedCountLabel;

    private Applicant applicant;
    /**
     * Whether this run has to supply a vacancy. Kept as state rather than read off
     * {@code vacancyField.isVisible()} because the field is hidden once the dialog switches to
     * the review table, long before the vacancy is written in {@link #attachSelectedVacancy()}.
     */
    private boolean vacancyRequired;
    /**
     * -- SETTER --
     *  Register a callback invoked by the dialog after a successful create-mode apply. The
     *  callback receives the saved applicant (already persisted with all parsed collections).
     *  The caller view typically switches from edit to read-only info mode.
     */
    @Setter
    private Consumer<Applicant> savedApplicantCallback;

    private volatile String jobId;
    private volatile String principalName;
    private volatile UI boundUi;
    private volatile int consecutivePollFailures = 0;
    private ScheduledFuture<?> pollFuture;
    private Notification applyErrorNotification;

    private final Map<String, FieldRow> rows = new LinkedHashMap<>();

    public void setApplicant(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Applicants must carry a vacancy before CV data is applied. It used to be asked for in a
     * {@code VacancyListView} lookup popped over the review table after "Apply"; it is now a
     * field at the top of this dialog, matching the batch import dialog. The field only appears
     * when the applicant has no vacancy yet (i.e. the create flow) — an applicant opened from
     * the kanban with a vacancy already attached keeps the plain upload form.
     * <p>
     * Options are installed here rather than on {@code InitEvent} because {@link #setApplicant}
     * runs in the caller's view configurer, i.e. after init: we would not yet know whether the
     * field is needed, and would pay {@code FilterComboBoxSupport}'s probe query for nothing.
     */
    private void setUpVacancyField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clearVacancyError() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateStartEnabled() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onDetach(DetachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "startBtn", subject = "clickListener")
    public void onStartBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "selectAllBtn", subject = "clickListener")
    public void onSelectAllBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "selectEmptyBtn", subject = "clickListener")
    public void onSelectEmptyBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Bulk update of all row checkboxes. Each {@code setValue} fires a listener which recomputes
     * the selected-count label — for N rows that would produce N UI patches. We update the label
     * once at the end instead.
     */
    private void setAllChecked(java.util.function.Predicate<FieldRow> target) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "applyBtn", subject = "clickListener")
    public void onApplyBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Set<String> collectSelectedFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Id of the vacancy picked at the top of the dialog, or {@code null} when the applicant
     * already carried one. The service attaches it to whichever applicant instance it saves, so
     * the vacancy lands in the same transaction as the CV data — it used to be committed
     * separately up front, which left the applicant carrying a vacancy but no CV data whenever
     * the apply that followed failed.
     */
    private UUID selectedVacancyId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void doApply(Set<String> selected) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Report an apply failure with enough substance to act on. The previous behaviour — one
     * generic "please try again" for every possible cause — gave the recruiter nothing to report
     * and left the developer with nothing to diagnose from a screenshot, so users just clicked
     * Apply again and stacked up identical toasts.
     * <p>
     * Known {@code ERR_*} codes from {@link ResumeParserService} become a translated sentence
     * with a concrete next step; everything else keeps the generic sentence but carries the root
     * cause's type and message (a DB constraint, a validation failure, ...). The full stack trace
     * is logged by the caller either way.
     */
    private void showApplyFailure(Exception ex) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String applyFailureText(Exception ex) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static Throwable rootCause(Throwable throwable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // Driver messages (constraint violations especially) can run to several lines of SQL; the
    // leading part is the diagnostic one and the rest would push the toast off screen.
    private static String abbreviate(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startPolling() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void stopPolling() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void pollTick() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CvParseJobResponse fetchStatusWithAuth() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String currentPrincipalName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void handlePollResult(CvParseJobResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "retryBtn", subject = "clickListener")
    public void onRetryBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void switchToReviewMode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * "Upload without preview" path: apply every field the CV brings, straight away, instead of
     * showing the mapping table.
     * <p>
     * Takes {@code rows.keySet()} rather than the checked rows: the review table pre-checks only
     * the fields the applicant left empty, whereas skipping the preview means "take the CV as-is",
     * so parsed values overwrite existing ones too. {@code rows} is already limited to fields
     * where the parser returned something that differs from the current value, so nothing is
     * blanked out by a CV that simply omits a field.
     */
    private void applyWithoutPreview() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void revealReviewSection() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // Resize the wrapping <vaadin-dialog-overlay> so the dialog grows from the compact upload
    // width to the wider review width. Width is clamped to min(target, 95vw) so narrow viewports
    // (mobile, half-screen) never produce a horizontally-scrolling page.
    private void resizeDialogOverlay(String width) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CvParseJob fetchJobWithAuth() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T> T withAuth(Supplier<T> work) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void renderStatus(CvParseJobResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatFailedStatus(String error) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void renderRows(Applicant current, ResumeParserResponse parsed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void renderHeaderRow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span spacer(String width) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span spacer(String width, String messageKey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // Header counterpart of buildValueSpan — flex 1 so the two value-column headers
    // align with their flex data cells regardless of viewport width.
    private Span flexHeader(String messageKey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addGenderRow(Gender current, String parsedRaw) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addScalarRow(String fieldKey, String currentValue, String parsedValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addCollectionRow(String fieldKey, int parsedCount) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout buildRow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout buildInteractiveRow(Checkbox checkbox) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Checkbox newCheckbox(boolean initial) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span buildLabelSpan(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span buildValueSpan(String text, boolean dim, boolean parsed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span buildArrowSpan() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div createBadge(boolean currentEmpty) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateSelectedCount() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String fieldLabel(String fieldKey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String resolveFirstName(ResumeParserResponse parsed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String resolveLastName(ResumeParserResponse parsed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatDate(OffsetDateTime dt) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static String normalize(String s) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private record FieldRow(Checkbox checkbox, boolean currentValueEmpty) {}
}
