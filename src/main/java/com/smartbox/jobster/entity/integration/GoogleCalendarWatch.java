package com.smartbox.jobster.entity.integration;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_GOOGLE_CALENDAR_WATCH", indexes = {
        @Index(name = "IDX_GCW_CHANNEL_ID", columnList = "CHANNEL_ID"),
        @Index(name = "IDX_GCW_INTEGRATED_USER", columnList = "INTEGRATED_USER_ID")
})
@Entity(name = "jb_GoogleCalendarWatch")
@Getter
@Setter
public class GoogleCalendarWatch extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 5493335136890668092L;

    @JoinColumn(name = "INTEGRATED_USER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private IntegratedUser integratedUser;

    @Column(name = "CHANNEL_ID", nullable = false)
    private String channelId;

    @Column(name = "RESOURCE_ID")
    private String resourceId;

    @Column(name = "EXPIRATION")
    private OffsetDateTime expiration;

    @Secret
    @Column(name = "SYNC_TOKEN", length = 1024)
    private String syncToken;

    @Column(name = "ACTIVE")
    private Boolean active = Boolean.TRUE;
}
