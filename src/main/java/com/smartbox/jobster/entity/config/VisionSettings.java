package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.defaults.AppSettingsDefaultInt;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Jobster team
 * Since: 1/21/2024 4:38 PM
 */
@JmixEntity
@Table(name = "VISION_SETTINGS")
@Entity
@Getter
@Setter
public class VisionSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = 186667612692002770L;

    @AppSettingsDefaultInt(100)
    @Column(name = "APP_VERSION")
    private Integer appVersion;

    @AppSettingsDefault("https://jobster.hr/images/logo-jobster.svg")
    @Column(name = "APP_FILE_URL")
    private String appFileUrl;
}
