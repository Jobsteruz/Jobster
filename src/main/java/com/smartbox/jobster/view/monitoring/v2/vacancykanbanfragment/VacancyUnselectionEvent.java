package com.smartbox.jobster.view.monitoring.v2.vacancykanbanfragment;

import com.smartbox.jobster.entity.hrm.Vacancy;
import com.vaadin.flow.component.Component;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class VacancyUnselectionEvent {
    private final Component src;
    private final Vacancy value;
}
