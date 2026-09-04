package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@JmixEntity
@Table(name = "JOB_DESCRIPTION")
@Entity
@Getter
@Setter
public class JobDescription extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = 1945867855783090144L;

    @Column(name = "PROMPT_FOR_CREATE")
    @Lob
    private String promptForCreate;

    @Column(name = "PROMPT_FOR_IMPROVE")
    @Lob
    private String promptForImprove;
}
