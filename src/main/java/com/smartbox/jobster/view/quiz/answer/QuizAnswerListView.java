package com.smartbox.jobster.view.quiz.answer;

import com.smartbox.jobster.entity.quiz.QuizAnswer;

import com.smartbox.jobster.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "quizAnswers", layout = MainView.class)
@ViewController("jb_QuizAnswer.list")
@ViewDescriptor("quiz-answer-list-view.xml")
@LookupComponent("quizAnswersDataGrid")
@DialogMode(width = "64em")
public class QuizAnswerListView extends StandardListView<QuizAnswer> {
}