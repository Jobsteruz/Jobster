package com.smartbox.jobster.entity.integration;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * A Microsoft Graph change-notification subscription for one recruiter's Outlook inbox — the analog
 * of {@link GoogleCalendarWatch}. Graph pushes a notification to our webhook whenever new mail
 * arrives; this row lets us resolve the owning {@link IntegratedUser}, authenticate the callback via
 * {@code clientState}, and renew before {@code expirationDateTime} (Graph caps message subscriptions
 * at ~7 days).
 */
@JmixEntity
@Table(name = "JB_OUTLOOK_SUBSCRIPTION", indexes = {
        @Index(name = "IDX_OSUB_SUBSCRIPTION_ID", columnList = "SUBSCRIPTION_ID"),
        @Index(name = "IDX_OSUB_INTEGRATED_USER", columnList = "INTEGRATED_USER_ID")
})
@Entity(name = "jb_OutlookSubscription")
@Getter
@Setter
public class OutlookSubscription extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -4491992031015463829L;

    @JoinColumn(name = "INTEGRATED_USER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private IntegratedUser integratedUser;

    @InstanceName
    @Column(name = "SUBSCRIPTION_ID")
    private String subscriptionId;

    @Column(name = "RESOURCE_", length = 512)
    private String resource;

    @Column(name = "EXPIRATION_DATE_TIME")
    private OffsetDateTime expirationDateTime;

    // Opaque secret Microsoft echoes back in every notification; callbacks whose value doesn't match
    // this are rejected (Graph's recommended notification-authenticity check for basic subscriptions).
    @Secret
    @Column(name = "CLIENT_STATE", length = 128)
    private String clientState;

    @Column(name = "ACTIVE")
    private Boolean active = Boolean.TRUE;
}
