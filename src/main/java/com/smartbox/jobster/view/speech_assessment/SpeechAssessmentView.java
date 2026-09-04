package com.smartbox.jobster.view.speech_assessment;


import com.google.gson.Gson;
import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.ai.AIServiceType;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.pojo.ai.request.SpeechAssessmentRequest;
import com.smartbox.jobster.pojo.ai.response.SpeechAssessmentResponse;
import com.smartbox.jobster.service.SpeechAssessmentService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.codeeditor.CodeEditor;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;
import java.util.Optional;

@Route(value = "speech-assessment", layout = MainView.class)
@ViewController("jb_SpeechAssessmentView")
@ViewDescriptor("speech-assessment-view.xml")
public class SpeechAssessmentView extends StandardView {
    private static final Logger log = LoggerFactory.getLogger(SpeechAssessmentView.class);

    @ViewComponent
    private FileStorageUploadField audioId;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Notifications notifications;
    @ViewComponent
    private CodeEditor responseValue;
    @ViewComponent
    private CollectionContainer<AIServiceLog> aiServicesDc;
    @ViewComponent
    private TypedTextField<Double> overallCost;
    @Autowired
    private SpeechAssessmentService speechAssessmentService;
    @ViewComponent
    private JmixSelect<Language> languages;
    @ViewComponent
    private JmixTextArea criteriaAreaId;

    @Subscribe(id = "evaluateBtn", subject = "clickListener")
    public void onEvaluateBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateCost() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}