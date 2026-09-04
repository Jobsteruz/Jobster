package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_CONFIRMATION_TOKEN", indexes = {
        @Index(name = "IDX_JB_CONFIRMATION_TOKEN_TEMP_COMPANY", columnList = "TEMP_COMPANY_ID"),
})
@Entity(name = "jb_ConfirmationToken")
@Getter
@Setter
public class ConfirmationToken extends StandardEntity implements Serializable {
    private static final long serialVersionUID = 8021470133772289774L;
    // in hours
    public static final long EXTENDED_VALIDATION = 24;
    private static final int TOKEN_SIZE_BYTES = 32;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMP_COMPANY_ID", nullable = false, updatable = false)
    private TemporaryCompany tempCompany;

    @Secret
    @Column(name = "TOKEN")
    private String token;

    @Column(name = "EXPIRATION_DATE")
    private OffsetDateTime expirationDate;

    @PostConstruct
    void init() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isExpired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @return token length of doubled TOKEN_SIZE_BYTES
     * <br>
     * generates doubled TOKEN_SIZE_BYTES size random bytes and converts it to hex format.
     */
    private static String generateToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void extendExpiration() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
