package com.smartbox.jobster.dto;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonExperienceAISearchDTO implements Serializable {
    private static final long serialVersionUID = 4123941301173868420L;

    private String id;
    private String tenantId;
    private String entityId;
    private String companyName;
    private String description;
    private String organization;
    private String position;
    private String from;
    private String to;
}
