package com.smartbox.jobster.service;

import com.smartbox.jobster.view.reports.staffcompleteness.StaffCompletenessByDeptReportDTO;
import com.smartbox.jobster.view.reports.staffcompleteness.StaffCompletenessDTO;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Service("jb_StaffCompletenessByDeptService")
@RequiredArgsConstructor
@UseReplica
public class StaffCompletenessByDeptService {

    private final DataManager dataManager;

    public StaffCompletenessByDeptReportDTO getReport() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private int asInt(Object value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private double round2(double value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
