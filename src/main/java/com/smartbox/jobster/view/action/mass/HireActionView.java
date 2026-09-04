package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.security.specific.UiEditAutoFillTemplateEnabled;
import com.smartbox.jobster.service.AutoFillTemplateService;
import io.jmix.flowui.settings.UserSettingsCache;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.utils.ActionUtils;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Route(value = "hire-action-view", layout = MainView.class)
@ViewController(id = "jb_HireActionView")
@ViewDescriptor(path = "hire-action-view.xml")
@DialogMode(width = "40em", height = "AUTO")
public class HireActionView extends StandardView {
    @Setter
    private KanbanStage stage;
    @Setter
    private Applicant applicant;
    @Setter
    private View<?> origin;

    @ViewComponent
    private JmixCheckboxGroup<Platform> platformBox;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> template;
    @ViewComponent
    private JmixRichTextEditor admitMessage;
    @ViewComponent
    private JmixTextArea admitSms;
    @ViewComponent
    private TypedDatePicker<LocalDate> startWorkDate;

    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private UserSettingsCache userSettingsCache;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("template")
    public void onTemplateComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<AutoFillTemplate>, AutoFillTemplate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "save", subject = "clickListener")
    public void onSaveClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancel", subject = "clickListener")
    public void onCancelClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendHireMsg() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void hireApplicant() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}