package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.VacancyStatus;
import com.smartbox.jobster.entity.integration.IntegratedVacancy;
import io.jmix.core.DataManager;
import io.jmix.core.Id;
import io.jmix.core.Messages;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class IntegratedVacancyService {
    private final DataManager dataManager;
    private final NotificationService notificationService;
    private final Messages messages;


    public String getIntegratedVacancy(Vacancy vacancy, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void unlinkHHIfClosed(Id<Vacancy> vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
