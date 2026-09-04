package com.smartbox.jobster.entity.ui;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_VIEW_SETTING")
@Entity(name = "jb_ViewSetting")
@Getter
@Setter
public class ViewSetting extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 4355258949756510351L;

    @Column(name = "VIEW_ID")
    private String viewId;

    @Column(name = "COMPONENT_ID")
    private String componentId;

    @Column(name = "VALUE_")
    private String value;
}