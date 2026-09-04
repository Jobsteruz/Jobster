package com.smartbox.jobster.entity.config;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_FCM_DEVICE_TOKEN", indexes = {
        @Index(name = "IDX_JB_FCM_DEVICE_USER", columnList = "USER_ID"),
})
@Entity(name = "jb_FcmDeviceToken")
@Getter
@Setter
public class FcmDeviceToken extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 6002104681063031613L;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Secret
    @Column(name = "TOKEN")
    private String token;

    @Column(name = "PLATFORM")
    private String platform;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}