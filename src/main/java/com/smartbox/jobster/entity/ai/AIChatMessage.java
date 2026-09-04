package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_AI_CHAT_MESSAGE", indexes = {
        @Index(name = "IDX_JB_AI_CHAT_MESSAGE_CHAT", columnList = "CHAT_ID"),
        @Index(name = "IDX_JB_AI_CHAT_MESSAGE_EMPLOYEE", columnList = "EMPLOYEE_ID")
})
@Entity(name = "jb_AIChatMessage")
@Getter
@Setter
public class AIChatMessage extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -7609090425295212811L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CHAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AIChat chat;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Column(name = "TIME")
    private OffsetDateTime time;

    @Column(name = "RESPONSE_TYPE", length = 50)
    private String responseType;

    @InstanceName
    @Lob
    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "JSON_FIELD")
    @Lob
    private String jsonField;

    public AIResponseType getResponseType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setResponseType(AIResponseType responseType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}