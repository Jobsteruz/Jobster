package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@JmixEntity(name = "jb_StandardOfferEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class StandardOfferEntity extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -1255988408327373381L;

    @Column(name = "OFFERED")
    private Boolean offered = Boolean.FALSE;

    @JoinColumn(name = "TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate template;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "LOCALE")
    private String locale;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "COMMENT_")
    @Lob
    private String comment;

    @Column(name = "DATE_")
    private LocalDateTime date;

    public PersonStatus getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus(PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getOffered() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}