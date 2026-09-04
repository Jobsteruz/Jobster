package com.smartbox.jobster.entity.security;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_SESSION_LOG_ENTRY", indexes = {
        @Index(name = "IDX_JB_SESSION_LOG_ENTRY_USER", columnList = "USER_ID")
})
@Entity(name = "jb_SessionLogEntry")
@Getter
@Setter
public class SessionLogEntry extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -8781667853156386688L;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @InstanceName
    @Column(name = "ACTION_")
    private Integer action;

    @Column(name = "IPADDRESS")
    private String ipaddress;

    @Column(name = "USERAGENT")
    private String useragent;

    @Column(name = "HOST")
    private String host;

    @Column(name = "STARTED_DATE")
    private OffsetDateTime startedDate;

    @Column(name = "FINISHED_DATE")
    private OffsetDateTime finishedDate;

    public SessionAction getAction() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAction(SessionAction action) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}