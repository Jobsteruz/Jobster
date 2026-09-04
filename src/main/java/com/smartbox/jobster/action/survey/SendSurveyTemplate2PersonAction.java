package com.smartbox.jobster.action.survey;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.schema.ActionFieldDto;
import com.smartbox.jobster.action.schema.ActionOptionDto;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.security.specific.UiEditAutoFillTemplateEnabled;
import com.smartbox.jobster.service.survey.SurveyService;
import com.smartbox.jobster.utils.ActionUtils;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.settings.UserSettingsCache;

import java.util.List;
import java.util.UUID;

public class SendSurveyTemplate2PersonAction extends AbstractJbKanbanAction {

    private final UserSettingsCache userSettingsCache = AppBeans.get(UserSettingsCache.class);
    private JmixRichTextEditor autoFillTempMsgArea;
    private JmixTextArea autoFillTempSmsArea;
    private TemplatePreview templatePreview;

    @Override
    protected void setMessageBundleGroup() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<ActionFieldDto> getInputSchema() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout surveyLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout templateLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void execute(JbEntity<UUID> targetEntity, KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

