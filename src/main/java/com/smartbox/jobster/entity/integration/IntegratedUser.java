package com.smartbox.jobster.entity.integration;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.Secret;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_INTEGRATED_USER", indexes = {
        @Index(name = "IDX_JB_INTEGRATED_USER_USER", columnList = "USER_ID")
})
@Entity(name = "jb_IntegratedUser")
@Getter
@Setter
public class IntegratedUser extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -8825870859107046443L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "INTEGRATION")
    private String integration;

    @Column(name = "INTEGRATION_EMAIL")
    private String integrationEmail;

    @InstanceName
    @Column(name = "INTEGRATION_ID")
    private String integrationId;

    // IshGO: kompaniya INN (bir userda har INN uchun alohida token bo'lishi mumkin)
    @Column(name = "INN")
    private String inn;

    @Column(name = "DATE_")
    private OffsetDateTime date;

    @Secret
    @Column(name = "RAW_RESPONSE")
    @Lob
    private String rawResponse;

    @Secret
    @Column(name = "ACCESS_TOKEN", length = 2048)
    private String accessToken;

    @Secret
    @Column(name = "REFRESH_TOKEN", length = 1024)
    private String refreshToken;

    @Column(name = "TOKEN_TYPE")
    private String tokenType;

    @Column(name = "SCOPE_")
    private String scope;

    @Column(name = "EXPIRES_IN")
    private Long expiresIn;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "STATUS_REASON")
    @Lob
    private String statusReason;

    @Column(name = "MANAGER_ID")
    private String managerId;

    @Column(name = "HH_SUBSCRIPTION_ID")
    private String hhSubscriptionId;

    public boolean isExpired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Platform getIntegration() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setIntegration(Platform integration) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transient
    public OAuth2AccessToken createAccessToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}