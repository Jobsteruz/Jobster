package com.smartbox.jobster.view.tempquestionanswer;

import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionAnswer;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "temp-question-answer", layout = MainView.class)
@ViewController("jb_TempQuestionAnswer.list")
@ViewDescriptor("temp-question-answer-list-view.xml")
@LookupComponent("tempQuestionAnswersTable")
public class TempQuestionAnswerListView extends StandardListView<TempQuestionAnswer> {

}

