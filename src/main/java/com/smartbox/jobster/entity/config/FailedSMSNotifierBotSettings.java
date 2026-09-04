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
@Table(name = "FAILED_SMS_NOTIFIER_BOT_SETTINGS")
@Entity
@Getter
@Setter
public class FailedSMSNotifierBotSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = -6879859866714432219L;

    @Secret
    @Column(name = "BOT_TOKEN")
    private String botToken;

    @Secret
    @Column(name = "GROUP_ID")
    private String groupId;

    @Column(name = "THREAD_ID")
    private Integer threadId;

}
