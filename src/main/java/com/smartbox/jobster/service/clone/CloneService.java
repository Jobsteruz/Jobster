package com.smartbox.jobster.service.clone;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.questionnaire.AnswerFormat;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.tg.Bot;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jobster team
 * Since: 7/8/2024 3:40 PM
 */
@Service
public class CloneService {

    @Autowired
    private DataManager dataManager;

    public AnswerFormat getClonedAnswerFormat(AnswerFormat format, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RoleType getClonedRole(RoleType role, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Kanban getClonedKanban(Kanban kanban, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStage getClonedKanbanStage(KanbanStage stage, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Questionnaire getClonedQuestionnaire(Questionnaire questionnaire, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Bot getClonedBot(Bot bot, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
