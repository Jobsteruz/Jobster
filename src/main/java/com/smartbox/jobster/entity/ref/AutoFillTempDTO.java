package com.smartbox.jobster.entity.ref;


import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.entity.trainee.TraineeGroupTrainer;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.person.EmployeeService;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Jobster team
 * Since: 12/12/2024 3:03 PM
 *
 * @param enableEventResponseButtons whether to ask <em>this</em> recipient to confirm
 * {@link #event()} — the candidate and the manager are invited through two separate DTOs and are
 * governed by two separate settings ("Запросить подтверждения у кандидата" / "…у менеджера"), so
 * each carries only its own answer to that question. Which wording and which callback the buttons
 * get follows from the recipient: see {@code AutoFillTemplateService#sendByTelegram}.
 */
public record AutoFillTempDTO(
        AutoFillTemplate template,
        Person person,
        Employee user,
        Company company,
        Person manager,
        Event event,
        Vacancy vacancy,
        Department branch,
        TraineeGroupIntern intern,
        TraineeGroupTrainer trainer,
        Boolean enableEventResponseButtons,
        KanbanStageEntity stageEntity) implements Serializable {

    @Serial
    private static final long serialVersionUID = 7564407522816820617L;

    public AutoFillTempDTO(AutoFillTemplate template, Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AutoFillTempDTO(AutoFillTemplate template, Person person, Person manager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AutoFillTempDTO(AutoFillTemplate template, Person person, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AutoFillTempDTO(AutoFillTemplate template, Person person, Person manager, Event event, Vacancy vacancy, Department branch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AutoFillTempDTO(AutoFillTemplate template, Person person, Person manager, Event event, Vacancy vacancy, Department branch, Boolean enableEventResponseButtons, KanbanStageEntity stageEntity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AutoFillTempDTO(AutoFillTemplate template, Person person, TraineeGroupIntern intern, TraineeGroupTrainer trainer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Same recipient and context, but with a different template instance — used to send a
     * per-recipient localized copy without mutating the template the caller reuses across a batch.
     */
    public AutoFillTempDTO withTemplate(AutoFillTemplate template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AutoFillTempDTO reloadPerson(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
