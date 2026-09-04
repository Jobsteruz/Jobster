package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.ui.Navigation;
import com.vaadin.flow.component.UI;
import io.jmix.core.DataManager;
import io.jmix.core.Metadata;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.view.MessageBundle;
import io.jmix.flowui.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BotLinkService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private SequenceService sequenceService;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Metadata metadata;

    public void copyMapLink(Notifications notifications, MessageBundle messageBundle,
                            String location, String emptyKey, String invalidKey, String copiedKey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param viewId     e.g. "jb_Branch.list" or "jb_Department.list" — Navigation.viewId
     * @param linkPrefix e.g. "department" or "branch"
     * @param msgPrefix  message key prefix e.g. "department.botLink" or "branch.botLink"
     */
    public void openGenerateDialog(View<?> view, Dialogs dialogs, Notifications notifications,
                                   MessageBundle messageBundle, UUID entityId, String tenantId,
                                   String viewId, String linkPrefix, String msgPrefix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
