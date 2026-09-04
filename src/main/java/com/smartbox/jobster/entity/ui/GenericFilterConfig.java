package com.smartbox.jobster.entity.ui;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_GENERIC_FILTER_CONFIG")
@Entity(name = "jb_GenericFilterConfig")
@Getter
@Setter
public class GenericFilterConfig extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 7158013583979508504L;

    @Column(name = "GENERIC_FILTER")
    private String genericFilter;

    @Column(name = "DEFAULT_CONFIG")
    private String defaultConfig;
}