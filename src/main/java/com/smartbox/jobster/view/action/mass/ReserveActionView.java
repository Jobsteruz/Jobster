package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.VacancyState;
import com.smartbox.jobster.entity.hrm.VacancyStatus;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.security.specific.UiEditAutoFillTemplateEnabled;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.PersonActionService;
import com.smartbox.jobster.utils.ActionUtils;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Route(value = "reserve-action-view", layout = MainView.class)
@ViewController("jb_ReserveActionView")
@ViewDescriptor("reserve-action-view.xml")
@DialogMode(width = "30em", height = "AUTO")
public class ReserveActionView extends StandardView {
    @Setter
    private JbEntity<UUID> jbEntity;
    private Map<JbEntity<UUID>, KanbanStage> entities;
    @Setter
    private AutoFillTemplate autoFillTemplate;

    /**
     * The texts as populated from the template, so an untouched message can be localized per recipient.
     */
    private String previewBody;
    private String previewSms;
    /**
     * The template's own texts, kept because the preview overwrites them on the template instance.
     */
    private String storedBody;
    private String storedSms;

    @ViewComponent
    private EntityComboBox<Vacancy> vacancyInput;
    @ViewComponent
    private JmixTextArea reserveCom;
    @ViewComponent
    private JmixTextArea reserveSms;
    @ViewComponent
    private JmixCheckboxGroup<Platform> platformBox;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> template;
    @ViewComponent
    private JmixRichTextEditor reserveMessage;

    @Autowired
    private PersonActionService personActionService;
    @Autowired
    private Messages messages;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
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

    private boolean isBatchMode() {
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

}