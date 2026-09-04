package com.smartbox.jobster.entity;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_MANAGER_FEEDBACK")
@Entity(name = "jb_ManagerFeedback")
@Getter
@Setter
public class ManagerFeedback extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -7263365112897622545L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "STATUS")
    private Boolean status = Boolean.FALSE;

    @Column(name = "PLATFORM")
    private String platform;

    @JoinColumn(name = "STAGE_HISTORY_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private KanbanStageHistory stageHistory;

    @JoinColumn(name = "MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee manager;

    @Column(name = "LOCALE")
    private String locale;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}