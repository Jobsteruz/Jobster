package com.smartbox.jobster.entity.report;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_REPORT_KANBAN_STAGE", indexes = {
        @Index(name = "IDX_JB_REPORT_KANBAN_STAGE_REPORT", columnList = "REPORT_ID"),
        @Index(name = "IDX_JB_REPORT_KANBAN_STAGE_KANBAN_STAGE", columnList = "KANBAN_STAGE_ID")
})
@Entity(name = "jb_ReportKanbanStage")
@Getter
@Setter
public class ReportKanbanStage extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -4405799666524185451L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "REPORT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReportView report;

    @JoinColumn(name = "KANBAN_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage kanbanStage;
}