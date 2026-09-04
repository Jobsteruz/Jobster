package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_AI_USAGE_LOG", indexes = {
        @Index(name = "IDX_JB_AI_USAGE_LOG_TENANT", columnList = "TENANT_ID"),
        @Index(name = "IDX_JB_AI_USAGE_LOG_CREATED", columnList = "CREATED_DATE")
})
@Entity(name = "jb_AiUsageLog")
@Getter
@Setter
public class AiUsageLog extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "MODEL", length = 100)
    private String model;

    @Column(name = "FEATURE", length = 50)
    private String feature;

    @Column(name = "INPUT_TOKENS")
    private Integer inputTokens;

    @Column(name = "OUTPUT_TOKENS")
    private Integer outputTokens;

    @Column(name = "THOUGHT_TOKENS")
    private Integer thoughtTokens;

    @Column(name = "TOTAL_TOKENS")
    private Integer totalTokens;

    @Column(name = "COST")
    private Double cost;

    @Column(name = "DURATION_MS")
    private Long durationMs;

    @Column(name = "SUCCESS")
    private Boolean success;

    @Column(name = "ERROR_MESSAGE", length = 2000)
    private String errorMessage;

    @Column(name = "STREAMING")
    private Boolean streaming;

    public AiUsageFeature getFeature() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFeature(AiUsageFeature feature) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
