package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.security.specific.UiEditAutoFillTemplateEnabled;
import com.smartbox.jobster.service.CancelReasonService;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.flowui.settings.UserSettingsCache;
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
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Route(value = "banned-action-view", layout = MainView.class)
@ViewController("jb_BannedActionView")
@ViewDescriptor("banned-action-view.xml")
@DialogMode(width = "30em", height = "AUTO")
public class BannedActionView extends StandardView {
    @Setter
    private JbEntity<UUID> jbEntity;
    private Map<JbEntity<UUID>, KanbanStage> entities;
    @Setter
    private AutoFillTemplate autoFillTemplate;

    /** The texts as populated from the template, so an untouched message can be localized per recipient. */
    private String previewBody;
    private String previewSms;

    @ViewComponent
    private JmixCheckboxGroup<Platform> platformBox;
    @ViewComponent
    private EntityComboBox<CancelReason> reasonInput;
    @ViewComponent
    private JmixTextArea bannedCom;
    @ViewComponent
    private JmixRichTextEditor bannedMessage;
    @ViewComponent
    private JmixTextArea bannedSms;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> template;

    @Autowired
    private Messages messages;
    @Autowired
    private PersonActionService personActionService;
    @Autowired
    private CancelReasonService cancelReasonService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private UserSettingsCache userSettingsCache;

    public void setEntities(Map<JbEntity<UUID>, KanbanStage> entities) {
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