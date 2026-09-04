package com.smartbox.jobster.view.speech_assessment.speech_assessment_info;


import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.pojo.ai.AbstractAIService;
import com.smartbox.jobster.pojo.ai.response.AbstractAIServiceResponse;
import com.smartbox.jobster.pojo.ai.response.SpeechAssessmentResponse;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.speech_assessment.speech_assessment_detailed_info.SpeechAssessmentDetailedInfoView;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Optional;
import java.util.function.Function;

@Route(value = "speech-assessment-info-view", layout = MainView.class)
@ViewController("jb_SpeechAssessmentInfoView")
@ViewDescriptor("speech-assessment-info-view.xml")
public class SpeechAssessmentInfoView extends StandardView {

    @ViewComponent
    private NativeLabel labelId;
    @Autowired
    private DialogWindows dialogWindows;


    private QuestionAnswer questionAnswer;
    private AIServiceLog serviceLog;
    @Autowired
    private Messages messages;

    @Subscribe("labelId")
    public void onLabelIdAttach(final AttachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "moreBtn", subject = "clickListener")
    public void onMoreBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void initProps(QuestionAnswer questionAnswer,AIServiceLog serviceLog) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}