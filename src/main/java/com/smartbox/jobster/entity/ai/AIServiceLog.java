package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.pojo.ai.request.AbstractAIServiceRequest;
import com.smartbox.jobster.pojo.ai.response.AbstractAIServiceResponse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_AI_SERVICE_LOG")
@Entity(name = "jb_AIServiceLog")
@Getter
@Setter
public class AIServiceLog extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -7363615565083213453L;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "COST")
    private Double cost;

    @Column(name = "INPUT_PARAMS", columnDefinition = "jsonb")
    @Lob
    private AbstractAIServiceRequest<? extends Serializable> inputParams;

    @Column(name = "OUTPUT_PARAMS", columnDefinition = "jsonb")
    @Lob
    private AbstractAIServiceResponse<? extends Serializable> outputParams;

    public AIServiceType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(AIServiceType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}