package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_REQUEST_CANCEL_REASON")
@Entity(name = "jb_RequestCancelReason")
@Getter
@Setter
public class RequestCancelReason extends ParentRef implements Serializable {
    private static final long serialVersionUID = 2229077777485218286L;

    @Column(name = "IS_VACANCY")
    private Boolean isVacancy;
}