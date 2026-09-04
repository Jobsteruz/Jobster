package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
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
@Table(name = "JB_AI_ENTITY_LIMIT", indexes = {
        @Index(name = "IDX_JB_AI_ENTITY_LIMIT_AI_ENTITY", columnList = "AI_ENTITY_ID")
})
@Entity(name = "jb_AIEntityLimit")
@Getter
@Setter
public class AIEntityLimit extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 2736503319997753480L;

    @InstanceName
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "AI_ENTITY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AIEntity aiEntity;

    @Column(name = "FOR_CREATE")
    private Boolean forCreate = Boolean.TRUE;

    @Column(name = "FOR_READ")
    private Boolean forRead = Boolean.TRUE;

    @Column(name = "FOR_UPDATE")
    private Boolean forUpdate = Boolean.TRUE;

    @Column(name = "FOR_DELETE")
    private Boolean forDelete = Boolean.TRUE;
}