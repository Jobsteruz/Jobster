package com.smartbox.jobster.entity.security;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@JmixEntity
@Table(name = "JB_IP_WHITELIST")
@Entity(name = "jb_IpWhitelist")
@Getter
@Setter
public class IpWhitelist extends StandardTenantEntity {

    @InstanceName
    @Column(name = "IP_ADDRESS", nullable = false)
    private String ipAddress;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ACTIVE")
    private Boolean active = true;
}
