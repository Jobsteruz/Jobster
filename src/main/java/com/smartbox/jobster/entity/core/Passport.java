package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.Country;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity(name = "jb_Passport")
@MappedSuperclass
@Getter
@Setter
public abstract class Passport extends Person implements Serializable {
    private static final long serialVersionUID = -2782856955232934717L;

    @JoinColumn(name = "RESIDENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Country resident;

    @Column(name = "PINFL")
    private String pinfl;

    @Column(name = "PINFL_HASH")
    private String pinflHash;

    @Column(name = "PASSPORT_NUMBER")
    private String passportNumber;

    @Column(name = "PASSPORT_ISSUED_BY")
    private String passportIssuedBy;

    @Column(name = "PASSPORT_DATE_OF_ISSUE")
    private LocalDate passportDateOfIssue;

    @Column(name = "PASSPORT_EXPIRED_DATE")
    private LocalDate passportExpiredDate;

    @Column(name = "PASSPORT_MEMO")
    @Lob
    private String passportMemo;

    @Override
    public void preUpdate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Auto-derive {@link #pinflHash} (MD5 of {@link #pinfl}) on every persist/update.
     * Ensures Applicant ↔ Employee matching by hashed PINFL stays consistent —
     * even if pinfl is changed by a single digit, the hash is recomputed.
     */
    public void syncPinflHash() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}