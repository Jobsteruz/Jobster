package com.smartbox.jobster.entity.robot;

import com.smartbox.jobster.entity.kanban.AbstractActionEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_ROBOT_ACTION", indexes = {
        @Index(name = "IDX_JB_ROBOT_ACTION_ROBOT", columnList = "ROBOT_ID")
})
@Entity(name = "jb_RobotAction")
@Getter
@Setter
public class RobotAction extends AbstractActionEntity implements Serializable {

    private static final long serialVersionUID = 8898175670083596841L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "ROBOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Robot robot;
}