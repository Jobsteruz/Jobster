package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "AURUM_STELLA_SETTINGS")
@Entity
@Getter
@Setter
public class AurumStellaSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = -1791169026043365528L;
    @Secret
    @Column(name = "SERVICE_ID")
    private String serviceId;

    @Secret
    @Column(name = "SECRET_KEY")
    private String secretKey;
    @Secret
    @Column(name = "ORIGINATOR")
    private String originator;
    @Secret
    @Column(name = "SEND_SMS_URL")
    private String sendSmsUrl;
}
