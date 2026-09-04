package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_KANBAN_STAGE_ENTITY", indexes = {
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_KANBAN_STAGE", columnList = "KANBAN_STAGE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_KANBAN", columnList = "KANBAN_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_ENTITY_ID", columnList = "ENTITY_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_STAGE_HISTORY", columnList = "STAGE_HISTORY_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_ID_KANBAN", columnList = "ENTITY_ID, KANBAN_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_STAGE_FINISHED", columnList = "ENTITY_ID, KANBAN_STAGE_ID, FINISHED"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ENTITY_TENANT_ENTITY", columnList = "TENANT_ID, ENTITY_ID, FINISHED")
})
@Entity(name = "jb_KanbanStageEntity")
@Getter
@Setter
public class KanbanStageEntity extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -3908119274795385353L;

    @JoinColumn(name = "KANBAN_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage kanbanStage;

    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @JoinColumn(name = "STAGE_HISTORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStageHistory stageHistory;

    @Column(name = "FINISHED")
    private Boolean finished;

    @Column(name = "FINISHED_DATE")
    private OffsetDateTime finishedDate;

    @Column(name = "VIEWED")
    private Boolean viewed = false;

    @Column(name = "MANAGER_VIEWED")
    private Boolean managerViewed = false;
}