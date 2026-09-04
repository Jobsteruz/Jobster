package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.entity.hrm.Experience;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.security.Authenticated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExperienceService {
    @Autowired
    private DataManager dataManager;

    public List<Experience> getActiveExperiences() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Experience getExperienceByNameForExtension(String tenant, String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Experience getExperienceByIshgoId(String tenant, Integer ishgoId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<PersonExperience> getPersonExperiencesByEntityIdAndName(UUID entityId, String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
