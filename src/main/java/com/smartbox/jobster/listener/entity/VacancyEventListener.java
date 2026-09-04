package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.pojo.JobDescriptionPojo;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.Id;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class VacancyEventListener {
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.job-description.routing-key}")
    private String routingKey;

    private final VacancyService vacancyService;
    private final CompanyService companyService;
    private final RabbitTemplate rabbitTemplate;
    private final RequestService requestService;
    private final DataManager dataManager;
    private final EmployeeService employeeService;
    private final AutoFillTemplateService autoFillTemplateService;
    private final IntegratedVacancyService integratedVacancyService;

    @EventListener
    void onVacancyChangedAfterCommit(EntityChangedEvent<Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void syncResponsibleToRequest(Id<Vacancy> vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openWorkPositions(Id<Vacancy> vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendJobDescription(Id<Vacancy> vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendRequestStatusNotification(Id<Vacancy> vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean matchesFilters(RequestStatusNotify notify, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendRequestStatusNotification(List<Employee> employees, RequestStatusNotify notify, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
