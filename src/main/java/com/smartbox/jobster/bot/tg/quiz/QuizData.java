package com.smartbox.jobster.bot.tg.quiz;

import java.util.UUID;

public interface QuizData {

    String QUIZ = "QUIZ_";
    String QUIZ_START_PERSON = "QUIZ_START_PERSON_";
    String QUIZ_FINISH_PERSON = "QUIZ_FINISH_PERSON_";

    String QUIZ_PERSON_QUESTION = "QUIZ_PERSON_QUESTION_";
    String QUIZ_ANSWER = "QUIZ_ANSWER_";


    default UUID fetchId(String data, String prefix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
