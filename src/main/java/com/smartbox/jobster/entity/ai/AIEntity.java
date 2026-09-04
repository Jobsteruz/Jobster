package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_AI_ENTITY")
@Entity(name = "jb_AIEntity")
@Getter
@Setter
public class AIEntity extends StandardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 4447436946835909254L;

    @InstanceName
    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "MEANING")
    @Lob
    private String meaning;

    @Column(name = "LIST_VIEW_ID")
    private String listViewId;

    @Column(name = "DETAIL_VIEW_ID")
    private String detailViewId;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "aiEntity")
    private List<AIField> fields;
}