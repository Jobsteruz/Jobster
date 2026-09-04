package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_AI_FIELD", indexes = {
        @Index(name = "IDX_JB_AI_FIELD_AI_ENTITY", columnList = "AI_ENTITY_ID")
})
@Entity(name = "jb_AIField")
@Getter
@Setter
public class AIField extends StandardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -7749922069280350823L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "AI_ENTITY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AIEntity aiEntity;

    @InstanceName
    @Column(name = "ENTITY_FIELD")
    private String entityField;

    @Column(name = "MEANING")
    @Lob
    private String meaning;

    @Column(name = "READ_ONLY")
    private Boolean readOnly = Boolean.TRUE;

    @Column(name = "TYPE")
    private String type = AIFieldType.STRING.getId();

    public AIFieldType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(AIFieldType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}