package com.smartbox.jobster.service.hh;

import com.github.scribejava.apis.HHApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.utils.StreamUtils;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.*;
import com.smartbox.jobster.entity.hrm.Education;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Experience;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.integration.IntegratedVacancy;
import com.smartbox.jobster.entity.integration.hh.HHStage;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import com.smartbox.jobster.entity.ref.SalaryLevel;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.person.PersonActionService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.utils.StringConstants;
import com.vaadin.flow.component.UI;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.core.Messages;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import jakarta.persistence.Entity;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class HHApplicantService {
    private static final Logger log = LoggerFactory.getLogger(HHApplicantService.class);
    private final RefSourceService refSourceService;

    @Autowired
    private PersonService personService;

    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private PersonActionService personActionService;
    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private Messages messages;
    @Autowired
    private FileService fileService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private UnconstrainedDataManager unconstrainedDataManager;
    @Autowired
    private HHVacancyService hhVacancyService;
    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private CancelReasonService cancelReasonService;

    public HHApplicantService(RefSourceService refSourceService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public boolean createInvitation(String applicantId, String vacancyId, String resumeId, String employerId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createdHHCandidate(IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void getCandidateFromHHPage(JSONObject response, IntegratedVacancy hhVacancy, IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createApplicant(JSONObject jsonObject, IntegratedUser user, String applicantHHId, IntegratedVacancy hhVacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean applyApplicantHH(JSONObject candidate, IntegratedVacancy hhVacancy, String applicantHHId, IntegratedUser user, String resumeId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Side rows written before the applicant itself, cleaned up when the applicant then loses the
     * race and never comes into existence. They are linked by a plain {@code personId} column
     * rather than a foreign key, so nothing else would ever notice them: they would just sit there
     * pointing at an id no row has. Everything else the import touches — salary level, language,
     * education and experience references — is shared lookup data that the winning copy uses too.
     */
    private void discardHHImportLeftovers(UUID applicantId, String negotiationId, Exception cause) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Is this negotiation already held, in this tenant, by a LIVE applicant other than {@code ourId}? */
    private boolean isNegotiationTakenByAnother(String platformId, String tenantId, UUID ourId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SalaryLevel isCreatedSalaryLevel(BigDecimal amount, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createHHLanguage(JSONObject candidate, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createHHContact(JSONObject candidate, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createHHApplicantDocument(JSONObject candidate, Applicant applicant, String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Language getOrCreateLanguage(String name, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createPersonPhotoFromHH(JSONObject photo, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createPersonEducation(JSONObject education, Applicant applicant, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createPersonExperience(JSONArray experience, Applicant applicant, SaveContext saveContext, JSONObject candidate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Has this HH negotiation already been imported for this tenant?
     * <p>
     * Scoped to the tenant, matching udx_jb_applicant_hh_platform_id. The negotiation id identifies
     * one candidate's application to ONE vacancy of ONE employer, not the candidate — the candidate
     * across companies is {@code hhResumeId}, which nothing here constrains. So a candidate who
     * applies to two companies brings two negotiation ids and gets a record in each, and even
     * within one company a second application is a second negotiation and a second row.
     * <p>
     * Unconstrained data manager on purpose. The poll path runs under the integrated user's own
     * authentication (HHQueueListener restores it so the import lands in their tenant), and a
     * manager whose roles cannot read every applicant would get a probe that only sees their own —
     * while all the other managers of the same employer import the very same negotiations, because
     * getHHVacancies() asks HH by employer_id. A visibility rule must not decide whether a row gets
     * written.
     * <p>
     * Soft-deleted rows count as "imported", which is the behaviour this has always had: a
     * candidate a recruiter deleted must stay deleted instead of coming back on the next poll.
     */
    private boolean isNegotiationImported(String platformId, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Page-batched twin of {@link #isNegotiationImported} — one probe per HH page instead of per item. */
    private Set<String> createdApplicantPlatformIds(List<String> platformIds, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isCreatedApplicant(String platformId, String tenantId, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void changeStageHHApplicant(String applicantHHId, HHStage hhStage, IntegratedUser integratedUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param responsible applicant'ning mas'ul xodimi — negotiation aynan uning HH akkauntida
     *                    turadi. {@code null} bo'lsa yoki HH integratsiyasi topilmasa, eski xulq:
     *                    joriy foydalanuvchi (MQ oqimida — SystemAuthenticator tiklagan jo'natuvchi).
     */
    public Boolean sendSMS2HHFromJobster(String message, String platformId, Employee responsible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Mas'ul xodimning HH integratsiyasi; topilmasa — joriy foydalanuvchiniki (eski xulq). */
    private IntegratedUser getIntegratedUser(Employee responsible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Xodim odatda {@code _instance_name} bilan keladi, ya'ni {@code user} fetch qilinmagan bo'lishi mumkin. */
    private User responsibleUser(Employee responsible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Reads the HH error discriminator out of an error body: {@code errors[0].value} when
     * present, otherwise {@code errors[0].type} — a 404 body carries only the type,
     * e.g. {@code {"errors":[{"type":"not_found"}]}}.
     *
     * @return the reason, or {@code null} if the body is missing or not HH's error shape
     */
    private String hhErrorReason(String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Maps an HH rejection reason to a user-facing message key. Falls back to
     * {@code forbiddenInHH}; the previous fallback key {@code forbidden} does not exist in
     * any bundle, so users were shown the literal string "forbidden".
     */
    private String hhRejectionMessageKey(String reason) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void getUnReadMessageHH(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Performs the actual stage-change PUT for the action matching {@code hhStage}.
     *
     * @return {@code true} only if HH accepted the change, so the caller can log the truth
     */
    private boolean changeStageHHApplicant(Response response, HHStage hhStage, String token) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean changeStageEventByHH(String applicantId, String vacancyId, HHStage to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean firstStageTrans(Applicant applicant, HHStage to, Vacancy vacancy, CancelReason cancelReason) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean otherStageTrans(Applicant applicant, HHStage to, List<KanbanStageEntity> kanbanStageEntities, Vacancy vacancy, CancelReason cancelReason) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private Applicant getApplicantByHHIdAndVacancyId(String platformId, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isContainJson(JSONObject jsonObject, String key) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<Applicant> getApplicantsByHHResumeId(String resumeId, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
