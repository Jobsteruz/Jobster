package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.ref.RefSource;
import io.jmix.core.DataManager;
import io.jmix.core.FluentValuesLoader;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class RefSourceService {

    @Autowired
    private QueryTransformerFactory queryTransformerFactory;
    @Autowired
    private DataManager dataManager;

    public RefSource getOrCreateByName(String name, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public List<KeyValueEntity> getPersonBySource(Kanban kanban, Position position, Department department,
                                                  OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public List<KeyValueEntity> getAdmittedAndReservedPersonCountBySource(Kanban kanban, Position position,
                                                                          Department department, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public List<KeyValueEntity> getInProgressPersonBySource(Kanban kanban, Position position, Department department,
                                                            OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public List<KeyValueEntity> getRejectedPersonBySource(Kanban kanban, Position position, Department department,
                                                          OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RefSource getRefSourceByMachineName(String machineName, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
