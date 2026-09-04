package com.smartbox.jobster.entity.sso;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_SCIM_TOKEN", indexes = {
        @Index(name = "IDX_JB_SCIM_TOKEN_PROVIDER", columnList = "SSO_PROVIDER_ID")
})
@Entity(name = "jb_ScimToken")
@Getter
@Setter
public class ScimToken extends SmartTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -2115642574765694907L;

    @Secret
    @Column(name = "TOKEN", nullable = false)
    private String token;

    @Column(name = "ACTIVE")
    private Boolean active = true;

    @Column(name = "EXPIRES_AT")
    private OffsetDateTime expiresAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SSO_PROVIDER_ID")
    private SsoProvider ssoProvider;
}
