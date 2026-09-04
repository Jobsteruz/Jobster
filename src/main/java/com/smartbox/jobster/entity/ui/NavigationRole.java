package com.smartbox.jobster.entity.ui;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_NAVIGATION_ROLE", indexes = {
        @Index(name = "IDX_JB_NAVIGATION_ROLE_NAVIGATION", columnList = "NAVIGATION_ID"),
        @Index(name = "IDX_JB_NAVIGATION_ROLE_ROLE", columnList = "ROLE_ID")
})
@Entity(name = "jb_NavigationRole")
@Getter
@Setter
public class NavigationRole extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -4852671294644944931L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "NAVIGATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Navigation navigation;

    @JoinColumn(name = "ROLE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType role;
}