package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.Region;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.security.Authenticated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author Jobster team
 * Since: 1/29/2025 11:52 AM
 */
@Service
public class RegionService {
    @Autowired
    private DataManager dataManager;


    @Transactional(readOnly = true)
    public List<Region> getChildRegions(Region parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<Region> getRootRegions() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Barcha regionlarni bitta query da yuklaydi va in-memory tree quradi.
     * TreeComboBox uchun — lazy loading N+1 muammosini bartaraf etadi.
     */
    @Transactional(readOnly = true)
    public List<Region> getRegionTree() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Region getByIshgoId(UUID id, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Region> getRegionJsonField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
