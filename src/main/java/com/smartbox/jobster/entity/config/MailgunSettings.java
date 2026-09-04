package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Jobster team
 * Since: 1/15/2024 2:55 PM
 */
@JmixEntity
@Table(name = "MAILGUN_SETTINGS")
@Entity
@Getter
@Setter
public class MailgunSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = 7598065603174547387L;

    @AppSettingsDefault("https://api.mailgun.net/v3/<mail-host>/messages")
    @Column(name = "MAILGUN_URL")
    private String mailgunUrl;

    @Secret
    @Column(name = "MAILGUN_TOKEN")
    private String mailgunToken;

    @AppSettingsDefault("APP.JOBSTER.UZ <noreply@<mail-host>>")
    @Column(name = "MAILGUN_FROM")
    private String mailgunFrom;

    @AppSettingsDefault("[JOBSTER.UZ] Сообщение от JOBSTER.UZ")
    @Column(name = "MAILGUN_TITLE")
    private String mailgunTitle;

    @AppSettingsDefault("[JOBSTER.HR] Сообщение от JOBSTER.HR")
    @Column(name = "MAILGUN_SUBJECT")
    private String mailgunSubject;
}
