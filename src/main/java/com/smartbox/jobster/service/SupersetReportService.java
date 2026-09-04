package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.superset.SupersetReportGroup;
import com.smartbox.jobster.entity.superset.SupersetReportView;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Read/write operations for {@link SupersetReportGroup} and {@link SupersetReportView}.
 * Mirrors the relevant slice of {@link ReportService} for the Superset BI report tree.
 */
@Service
public class SupersetReportService {

    @Autowired
    private DataManager dataManager;

    public List<SupersetReportGroup> getGroups() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<SupersetReportView> getFavorites() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SupersetReportView getByCrcId(String crcId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Roles allowed to see the given Superset report. Empty list means "no role restriction"
     * (visible to all roles), mirroring {@link ReportService#getReportRoles} semantics.
     */
    public List<RoleType> getReportRoles(SupersetReportView report) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
