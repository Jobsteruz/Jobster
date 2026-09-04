package com.smartbox.jobster.entity.checklist.template;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_CHECKLIST_TEMPLATE")
@Entity(name = "jb_ChecklistTemplate")
@Getter
@Setter
public class ChecklistTemplate extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 2194437903783667052L;

    @Column(name = "TOTAL_SCORE")
    private Double totalScore;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "checklist")
    private List<TaskTemplate> tasks;
}