package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.CustomQuickAdd;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "applicantQuickAdd/:id", layout = MainView.class)
@ViewController("jb_Applicant.quickAdd")
@ViewDescriptor("applicant-quick-add-view.xml")
@EditedEntityContainer("applicantDc")
@DialogMode(draggable = false)
public class ApplicantQuickAddView extends CustomQuickAdd<Applicant> {

    @ViewComponent
    private EntityComboBox<Employee> responsible;

    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    /**
     * Lazy options for the heavy Employee table so opening this quick-add no longer loads the whole
     * employee list into the session. The field keeps its value binding (dataContainer/property),
     * so a saved responsible still renders.
     */
    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}