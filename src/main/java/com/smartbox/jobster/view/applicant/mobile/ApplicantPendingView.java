package com.smartbox.jobster.view.applicant.mobile;


import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.component.mobile.ApplicantCard;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.WorkSchedule;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractMobileListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;

@Route(value = "applicant-pending-view", layout = MainView.class)
@ViewController("jb_ApplicantPendingView")
@ViewDescriptor("applicant-pending-view.xml")
public class ApplicantPendingView extends AbstractMobileListView<Applicant> {

    /** Year length used by {@link Person#getAge()}; the age filter must use the same one. */
    private static final double DAYS_IN_YEAR = 365.25d;
    /** Keeps an absurd entry from pushing the computed birth date out of the supported range. */
    private static final int MAX_AGE = 150;

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @ViewComponent
    private EntityComboBox<Region> regionField;
    @ViewComponent
    private EntityComboBox<Department> departmentField;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private EntityComboBox<WorkSchedule> scheduleField;

    @ViewComponent
    private TypedTextField<String> fullNameField;
    @ViewComponent
    private TypedTextField<String> phoneField;
    @ViewComponent
    private TypedTextField<String> emailField;
    @ViewComponent
    private JmixIntegerField ageFromField;
    @ViewComponent
    private JmixIntegerField ageToField;

    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onTimerTimerAction(Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Translates the entered age range into birth-date bounds: age is a computed property
     * ({@link Person#getAge()}), so it cannot be queried directly. The bounds are derived with the
     * very same {@code floor(days / 365.25)} arithmetic, which keeps the range in step with the age
     * printed on the card. Applicants without a birth date fall out of the range, as they should.
     */
    private void setAgeParams() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Latest birth date of somebody who has already reached the given age. */
    private static OffsetDateTime bornOnOrBefore(int age) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoad(final CollectionLoader.PostLoadEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regionField")
    public void onRegionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Region>, Region> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fullNameField")
    public void onFullNameChange(AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("phoneField")
    public void onPhoneChange(AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("emailField")
    public void onEmailChange(AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentField")
    public void onDepartmentChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<Department>, Department> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("scheduleField")
    public void onScheduleChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<WorkSchedule>, WorkSchedule> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("ageFromField")
    public void onAgeFromChange(AbstractField.ComponentValueChangeEvent<JmixIntegerField, Integer> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("ageToField")
    public void onAgeToChange(AbstractField.ComponentValueChangeEvent<JmixIntegerField, Integer> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
