package com.smartbox.jobster.entity.user;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_USER_CONFIRMATION_TOKEN", indexes = {
        @Index(name = "IDX_JB_USER_CONFIRMATION_TOKEN_USER", columnList = "USER_ID"),
        @Index(name = "IDX_JB_USER_CONF_TOKEN_TOKEN", columnList = "TOKEN")
})
@Entity(name = "jb_UserConfirmationToken")
@Getter
@Setter
public class UserConfirmationToken extends StandardEntity implements Serializable {
    private static final long serialVersionUID = -4582934759283475L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @Secret
    @Column(name = "TOKEN", nullable = false)
    private String token;

    @Column(name = "EXPIRATION_DATE", nullable = false)
    private OffsetDateTime expirationDate;

    @Column(name = "USED")
    private Boolean used = false;
}
