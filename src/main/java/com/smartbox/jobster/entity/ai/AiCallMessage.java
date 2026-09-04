package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@JmixEntity
@Table(name = "JB_AI_CALL_MESSAGE")
@Entity(name = "jb_AiCallMessage")
public class AiCallMessage extends StandardTenantEntity implements Serializable {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AI_CALL_ID", nullable = false)
    private AiCall aiCall;

    @Column(name = "EXTERNAL_MESSAGE_ID")
    private Integer externalMessageId;

    @Column(name = "ROLE")
    private String role;

    @Lob
    @Column(name = "MESSAGE_TEXT")
    private String text;

    @Column(name = "AUDIO_PATH", length = 1000)
    private String audioPath;

    @Column(name = "AUDIO_URL", length = 2000)
    private String audioUrl;

    @Column(name = "MESSAGE_ORDER")
    private Integer messageOrder;

    @Lob
    @Column(name = "PARTS_JSON")
    private String partsJson;

    public UUID getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setId(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}