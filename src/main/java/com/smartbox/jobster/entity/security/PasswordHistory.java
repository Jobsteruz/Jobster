package com.smartbox.jobster.entity.security;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * One previously-used password hash for a {@link User}. The password policy keeps the last N rows
 * (newest by {@code createdDate}) and rejects a new password whose hash matches any of them, so a
 * mandatory rotation cannot be defeated by immediately re-setting the old password.
 *
 * @see com.smartbox.jobster.service.security.PasswordPolicyService
 */
@JmixEntity
@Table(name = "JB_PASSWORD_HISTORY", indexes = {
        @Index(name = "IDX_JB_PASSWORD_HISTORY_USER", columnList = "USER_ID")
})
@Entity(name = "jb_PasswordHistory")
@Getter
@Setter
public class PasswordHistory extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -5821049283746151002L;

    @JoinColumn(name = "USER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Secret
    @Column(name = "PASSWORD_HASH", nullable = false)
    private String passwordHash;
}
