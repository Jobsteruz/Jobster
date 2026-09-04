package com.smartbox.jobster.entity;

import com.google.common.base.Strings;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.entity.ui.Theme;
import com.smartbox.jobster.view.auth.login_locale.LoginLocales;
import io.jmix.core.HasTimeZone;
import io.jmix.core.annotation.Secret;
import io.jmix.core.annotation.TenantId;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.security.authentication.JmixUserDetails;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Collections;

@JmixEntity
@Entity(name = "jb_User")
@Table(name = "JB_USER", indexes = {
        @Index(name = "IDX_JB_USER_ON_USERNAME", columnList = "USERNAME", unique = true),
        @Index(name = "IDX_JB_USER_NAVIGATION", columnList = "NAVIGATION_ID")
})
@Getter
@Setter
public class User extends SmartTenantEntity implements JmixUserDetails, HasTimeZone, Serializable {
    @Serial
    private static final long serialVersionUID = 962943710141638880L;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @Column(name = "USERNAME", nullable = false)
    protected String username;

    @Secret
    @SystemLevel
    @Column(name = "PASSWORD")
    protected String password;

    /**
     * When the password was last set. Drives the 30-day expiry policy (see PasswordPolicyService).
     * {@code null} is treated as "never tracked" and backfilled to now() by the policy changelog.
     */
    @Column(name = "PASSWORD_CHANGE_DATE")
    protected OffsetDateTime passwordChangeDate;

    /**
     * Forces a password change on next login regardless of {@link #passwordChangeDate} — set when an
     * admin resets the password or a user is newly created, so the first login must rotate it.
     */
    @Column(name = "PASSWORD_CHANGE_REQUIRED")
    protected Boolean passwordChangeRequired = false;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "ACTIVE")
    protected Boolean active = true;

    @Column(name = "TIME_ZONE_ID")
    protected String timeZoneId;

    @Column(name = "THEME")
    protected String theme;

    @JoinColumn(name = "NAVIGATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Navigation navigation;

    @Column(name = "LOCALE")
    protected String locale;

    @Transient
    protected Collection<? extends GrantedAuthority> authorities;

    @TenantId
    @Column(name = "TENANT_ID")
    protected String tenantId;

    @Column(name = "EXTERNAL_ID")
    protected String externalId;

    @Column(name = "SSO_PROVIDER")
    protected String ssoProvider;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setAuthorities(final Collection<? extends GrantedAuthority> authorities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isAccountNonExpired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isAccountNonLocked() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isEnabled() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Theme getTheme() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setTheme(Theme theme) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LoginLocales getLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLocale(LoginLocales loginLocales) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"firstName", "lastName", "username"})
    public String getDisplayName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getFullName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
