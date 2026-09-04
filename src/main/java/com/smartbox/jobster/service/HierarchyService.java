package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.pojo.AbstractHierarchicOption;
import com.smartbox.jobster.pojo.DepartmentHierarchicOption;
import com.smartbox.jobster.pojo.SimpleHierarchicOption;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.InstanceNameProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HierarchyService {

    @Autowired
    private TranslateService translateService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private EntityService entityService;

    public List<AbstractHierarchicOption> getRegionsWithChildren(String tenantId, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<AbstractHierarchicOption> getRegionsWithChildrenDistinct(String tenantId, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private AbstractHierarchicOption makeOption(Region region, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public Collection<AbstractHierarchicOption> getDepartmentsWithChildren(String tenantId, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<AbstractHierarchicOption> getDepartmentsWithChildrenWeb(String tenantId, DepartmentType type, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private DepartmentHierarchicOption makeOption(Department department, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<AbstractHierarchicOption> getPositions(String tenantId, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private String translateEntityName(Object possiblyEntity, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
