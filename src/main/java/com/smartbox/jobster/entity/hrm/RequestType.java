package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_REQUEST_TYPE")
@Entity(name = "jb_RequestType")
@Getter
@Setter
public class RequestType extends ParentRef implements Serializable {
    private static final long serialVersionUID = -725506493992323581L;
}