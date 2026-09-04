package com.smartbox.jobster.entity.survey;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_SURVEY")
@Entity(name = "jb_Survey")
@Getter
@Setter
public class Survey extends ParentRef implements Serializable {

    @Serial
    private static final long serialVersionUID = -7482586959781680053L;

    @Column(name = "FORCE_SEND_IN_DAYS")
    private Integer forceSendInDays;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "survey")
    private List<SurveyQuestion> questions;
}