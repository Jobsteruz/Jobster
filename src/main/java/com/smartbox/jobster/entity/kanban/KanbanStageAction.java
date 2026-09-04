package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasSort;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

@JmixEntity
@Table(name = "JB_KANBAN_STAGE_ACTION", indexes = {
        @Index(name = "IDX_JB_KANBAN_STAGE_ACTION_KANBAN_STAGE", columnList = "KANBAN_STAGE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ACTION_KANBAN", columnList = "KANBAN_ID")
})
@Entity(name = "jb_KanbanStageAction")
@Getter
@Setter
public class KanbanStageAction extends AbstractActionEntity implements HasSort, Serializable {
    private static final long serialVersionUID = -7423321791437876082L;

    @JoinColumn(name = "KANBAN_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage kanbanStage;

    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @Column(name = "OPT_PARAMS")
    @Lob
    private String optParams;

    public Map<String, String> getOptParams() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setOptParams(Map<String, String> optParams) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}