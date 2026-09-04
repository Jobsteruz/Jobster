package com.smartbox.jobster.bean;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanTemplate;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.kanban.KanbanService;
import io.jmix.core.FetchPlan;
import io.jmix.core.FetchPlanBuilder;
import io.jmix.core.FetchPlans;
import io.jmix.core.Metadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KanbanFetchPlanBuilder {

    @Autowired
    private Metadata metadata;
    @Autowired
    private FetchPlans fetchPlans;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private EntityService entityService;


    public FetchPlan build(KanbanTemplate template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private static void addDefaultProperties(FetchPlanBuilder fetchPlanBuilder, Class<?> aClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
