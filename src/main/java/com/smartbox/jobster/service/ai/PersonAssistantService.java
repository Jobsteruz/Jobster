package com.smartbox.jobster.service.ai;

import com.smartbox.jobster.entity.ai.PersonAssistant;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import io.jmix.core.DataManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonAssistantService {
    private final DataManager dataManager;


    public List<PersonAssistant> getMessages(UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuizPerson getQuizPerson(UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TempQuestionnairePerson getAdditionQuestionnaire(UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
