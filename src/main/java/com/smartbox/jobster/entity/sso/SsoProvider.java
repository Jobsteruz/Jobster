package com.smartbox.jobster.entity.sso;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_SSO_PROVIDER")
@Entity(name = "jb_SsoProvider")
@Getter
@Setter
public class SsoProvider extends SmartTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 6937507251956463683L;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "ENTITY_ID")
    private String entityId;

    @Column(name = "ACS_URL")
    private String acsUrl;

    @Column(name = "IDP_ENTITY_ID")
    private String idpEntityId;

    @Column(name = "IDP_LOGIN_URL")
    private String idpLoginUrl;

    @Column(name = "IDP_METADATA_URL")
    private String idpMetadataUrl;

    @Lob
    @Column(name = "CERTIFICATE")
    private String certificate;

    @Column(name = "ENABLED")
    private Boolean enabled = false;

    @Column(name = "DOMAIN_PATTERN")
    private String domainPattern;

    @Column(name = "DEFAULT_ROLE_CODE")
    private String defaultRoleCode;

    @Column(name = "ALLOWED_GROUP_IDS", length = 1024)
    private String allowedGroupIds;

    @Composition
    @OneToMany(mappedBy = "ssoProvider")
    private List<SamlRoleMapping> roleMappings;

    @Composition
    @OneToMany(mappedBy = "ssoProvider")
    private List<ScimToken> scimTokens;
}
