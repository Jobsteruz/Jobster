package com.smartbox.jobster.entity;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "NOTISEND_SETTINGS")
@Entity
@Getter
@Setter
public class NotiSendSettings extends AppSettingsEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1618137391293249159L;

    @Secret
    @Column(name = "NOTISEND_URL")
    private String notiSendUrl;

    @Secret
    @Column(name = "NOTISEND_TOKEN")
    private String notiSendToken;

    @AppSettingsDefault("APP.JOBSTER.HR")
    @Column(name = "NOTISEND_NAME")
    private String notiSendName;

    @Secret
    @Column(name = "NOTISEND_EMAIL")
    private String notiSendEmail;

    @AppSettingsDefault("[JOBSTER.HR] Сообщение от JOBSTER.HR")
    @Column(name = "NOTISEND_SUBJECT")
    private String notiSendSubject;
}
