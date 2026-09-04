package com.smartbox.jobster.entity.sso;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SAML_ROLE_MAPPING", indexes = {
        @Index(name = "IDX_JB_SAML_ROLE_MAPPING_PROVIDER", columnList = "SSO_PROVIDER_ID")
})
@Entity(name = "jb_SamlRoleMapping")
@Getter
@Setter
public class SamlRoleMapping extends SmartTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -4237788201130541040L;

    @InstanceName
    @Column(name = "EXTERNAL_ROLE_NAME", nullable = false)
    private String externalRoleName;

    @Column(name = "JOBSTER_ROLE_CODE", nullable = false)
    private String jobsterRoleCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SSO_PROVIDER_ID")
    private SsoProvider ssoProvider;
}
