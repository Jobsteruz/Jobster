package com.smartbox.jobster.entity.config;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_NOTIFICATION_SETTING", indexes = {
        @Index(name = "IDX_JB_NOTIFICATION_SETTING_USER", columnList = "USER_ID")
})
@Entity(name = "jb_NotificationSetting")
@Getter
@Setter
public class NotificationSetting extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -2847593018475930184L;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @JoinColumn(name = "USER_ID", nullable = false, unique = true)
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "EMAIL_ENABLED")
    private Boolean emailEnabled = Boolean.TRUE;

    @Column(name = "SMS_ENABLED")
    private Boolean smsEnabled = Boolean.TRUE;

    @Column(name = "TELEGRAM_ENABLED")
    private Boolean telegramEnabled = Boolean.TRUE;

    @Column(name = "PUSH_ENABLED")
    private Boolean pushEnabled = Boolean.TRUE;
}
