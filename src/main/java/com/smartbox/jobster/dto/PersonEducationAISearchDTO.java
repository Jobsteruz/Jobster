package com.smartbox.jobster.dto;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonEducationAISearchDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -1333920234605809708L;

    private String id;
    private String tenantId;
    private String entityId;
    private String name;
    private String description;
    private String level;
    private String specialist;
    private String from;
    private String to;
}
