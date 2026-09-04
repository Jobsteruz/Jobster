package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.entity.hrm.Education;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.security.Authenticated;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EducationService {

    @Autowired
    private DataManager dataManager;

    @Autowired
    TenantProvider tenantProvider;

    public List<Education> getEducationsByTenant() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Education getEducationByNameForExtension(String tenant, String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Education getEducationByName(String tenant, String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<PersonEducation> getPersonEducationsByEntityIdAndName(UUID entityId, String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
