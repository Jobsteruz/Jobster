package com.smartbox.jobster.service;

import com.smartbox.jobster.controller.open.ManagerFeedbackController;
import com.smartbox.jobster.entity.ManagerFeedback;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import io.jmix.core.DataManager;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ManagerFeedbackService {
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Environment environment;

    public String createManagerFeedback(Person person, Employee manager, Platform platform, KanbanStageHistory kanbanStageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
