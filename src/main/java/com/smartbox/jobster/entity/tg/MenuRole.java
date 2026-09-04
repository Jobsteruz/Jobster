package com.smartbox.jobster.entity.tg;

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
@Table(name = "JB_MENU_ROLE", indexes = {
        @Index(name = "IDX_JB_MENU_ROLE_MENU", columnList = "MENU_ID"),
        @Index(name = "IDX_JB_MENU_ROLE_ROLE", columnList = "ROLE_ID")
})
@Entity(name = "jb_MenuRole")
@Getter
@Setter
public class MenuRole extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -4649858102951478541L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "MENU_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Menu menu;

    @JoinColumn(name = "ROLE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType role;
}