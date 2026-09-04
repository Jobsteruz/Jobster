package com.smartbox.jobster.entity.tg;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TG_UTM", indexes = {
        @Index(name = "IDX_JB_TG_UTM_TG_USER", columnList = "TG_USER_ID")
})
@Entity(name = "jb_TgUtm")
@Getter
@Setter
public class TgUtm extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -4384023737960989102L;

    @JoinColumn(name = "TG_USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TgUser tgUser;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "PARAM")
    private String param;

    @Column(name = "RETURNED")
    private Integer returned = 0;
}