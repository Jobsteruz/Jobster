package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.EventService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.security.specific.UiEditAutoFillTemplateEnabled;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.utils.ActionUtils;
import io.jmix.flowui.settings.UserSettingsCache;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.datetimepicker.TypedDateTimePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Route(value = "bulk-invite-view", layout = MainView.class)
@ViewController("jb_InviteEventView")
@ViewDescriptor("invite-event-view.xml")
@DialogMode(width = "40em", height = "AUTO")
public class InviteEventView extends StandardView {
    @Setter
    private JbEntity<UUID> jbEntity;
    private Map<JbEntity<UUID>, KanbanStage> entities;

    /** The texts as populated from the template, so an untouched message can be localized per recipient. */
    private String previewBody;
    private String previewSms;

    @ViewComponent
    private JmixCheckboxGroup<Platform> platformBox;
    @ViewComponent
    private EntityComboBox<Employee> responsible;
    @ViewComponent
    private TypedDateTimePicker<OffsetDateTime> date;
    @ViewComponent
    private TypedTextField<String> title;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> template;
    @ViewComponent
    private JmixTextArea comment;
    @ViewComponent
    private JmixRichTextEditor message;
    @ViewComponent
    private JmixTextArea sms;
    @ViewComponent
    private EntityComboBox<Department> branch;
    @ViewComponent
    private JmixSelect<Priority> priorityField;
    @ViewComponent
    private JmixCheckbox enableEventResponseButtons;

    @Autowired
    private TimeSource timeSource;
    @Autowired
    private Messages messages;
    @Autowired
    private EventService eventService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    public void setEntities(Map<JbEntity<UUID>, KanbanStage> entities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

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

    @Subscribe("responsible")
    public void onResponsibleComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Employee>, Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancel", subject = "clickListener")
    public void onCancelClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "send", subject = "clickListener")
    public void onSendClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createEvent(OffsetDateTime time) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}