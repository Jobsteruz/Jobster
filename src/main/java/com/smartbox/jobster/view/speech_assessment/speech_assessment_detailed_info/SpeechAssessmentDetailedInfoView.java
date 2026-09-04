package com.smartbox.jobster.view.speech_assessment.speech_assessment_detailed_info;


import com.smartbox.jobster.component.AudioPlayer;
import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.pojo.ai.AbstractAIService;
import com.smartbox.jobster.pojo.ai.response.AbstractAIServiceResponse;
import com.smartbox.jobster.pojo.ai.response.SpeechAssessmentResponse;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixNumberField;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.Function;

@Route(value = "speech-assessment-detailed-info-view", layout = MainView.class)
@ViewController("jb_SpeechAssessmentDetailedInfoView")
@ViewDescriptor("speech-assessment-detailed-info-view.xml")
public class SpeechAssessmentDetailedInfoView extends StandardView {


    private static final Logger log = LoggerFactory.getLogger(SpeechAssessmentDetailedInfoView.class);

    @ViewComponent
    private JmixNumberField aiScore;
    @ViewComponent
    private JmixTextArea speechTranscript;
    @ViewComponent
    private JmixTextArea aiComment;
    @ViewComponent
    private HorizontalLayout fileDownloadArea;

    private AIServiceLog serviceLog;
    private QuestionAnswer questionAnswer;
    @Autowired
    private Messages messages;

    @Subscribe(id = "speechCloseIcon", subject = "clickListener")
    public void onSpeechCloseIconClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAttachEvent(final AttachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void initProps(QuestionAnswer questionAnswer, AIServiceLog serviceLog) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}