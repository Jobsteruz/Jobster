package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.VacancyState;
import com.smartbox.jobster.entity.ref.RefSource;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Route(value = "mass-division-view", layout = MainView.class)
@ViewController("jb_MassDivisionView")
@ViewDescriptor("mass-division-view.xml")
@DialogMode(width = "450px", height = "AUTO")
public class MassDivisionView extends StandardView {
    private TreeComboBox<Region> regionTreeComboBox;

    @Setter
    private Boolean visiblePosition = false;
    @Setter
    private Boolean visibleResponsible = false;
    @Setter
    private Boolean visibleRoleType = false;
    @Setter
    private Boolean visibleCategory = false;
    @Setter
    private Boolean visibleSource = false;
    @Setter
    private Set<? extends Person> editedEntities;

    @ViewComponent
    private EntityComboBox<Vacancy> vacancyField;
    @ViewComponent
    private EntityComboBox<Employee> responsibleField;
    @ViewComponent
    private EntityComboBox<RoleType> roleTypeField;
    @ViewComponent
    private EntityComboBox<PersonCategory> categoryField;
    @ViewComponent
    private EntityComboBox<RefSource> sourceField;
    @ViewComponent
    private JmixSelect<PersonStatus> statusField;
    @ViewComponent
    private VerticalLayout division;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}