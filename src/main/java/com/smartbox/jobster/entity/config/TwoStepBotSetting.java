package com.smartbox.jobster.entity.config;

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

/**
 * @author Jobster team
 * Since: 7/22/2025 17:29 PM
 */
@JmixEntity
@Table(name = "TWO_STEP_BOT_SETTINGS")
@Entity
@Getter
@Setter
public class TwoStepBotSetting extends AppSettingsEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 8362586418242669987L;

    @Secret
    @Column(name = "BOT_TOKEN")
    private String botToken;

    @Secret
    @Column(name = "GROUP_CHAT_ID")
    private String groupChatId;
}
