package com.smartbox.jobster.entity.trainee.config;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_TRAINEE_GROUP_CONFIG", indexes = {
        @Index(name = "IDX_JB_TRAINEE_GROUP_CONFIG_TARGET_STAGE", columnList = "TARGET_STAGE_ID"),
        @Index(name = "IDX_JB_TRAINEE_GROUP_CONFIG_TRANSFER_STAGE", columnList = "TRANSFER_STAGE_ID"),
        @Index(name = "IDX_JB_TRAINEE_GROUP_CONFIG_MANAGER_TEMPLATE", columnList = "MANAGER_TEMPLATE_ID"),
        @Index(name = "IDX_JB_TRAINEE_GROUP_CONFIG_TRAINER_TEMPLATE", columnList = "TRAINER_TEMPLATE_ID")
})
@Entity(name = "jb_TraineeGroupConfig")
@Getter
@Setter
public class TraineeGroupConfig extends ParentRef implements Serializable {

    private static final long serialVersionUID = 2477845555483748622L;

    @Column(name = "MIN_NUM_INTERN")
    private Integer minNumIntern;

    @Column(name = "MAX_NUM_INTERN")
    private Integer maxNumIntern;

    @JoinColumn(name = "TARGET_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage targetStage;

    @JoinColumn(name = "TRANSFER_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage transferStage;

    @Column(name = "DURATION")
    private Integer duration;

    @JoinColumn(name = "MANAGER_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate managerTemplate;

    @JoinColumn(name = "TRAINER_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate trainerTemplate;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "groupConfig")
    private List<TraineeGroupPosition> positions;

    public Integer getMinNumIntern() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getMaxNumIntern() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getDuration() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}