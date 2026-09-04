package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_PERSON_ASSISTANT", indexes = {
        @Index(name = "IDX_JB_PERSON_ASSISTANT_EMPLOYEE", columnList = "EMPLOYEE_ID")
})
@Entity(name = "jb_PersonAssistant")
@Getter
@Setter
public class PersonAssistant extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -3952590646786183791L;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "ACTION_")
    private String action;

    @Column(name = "REQUEST_TIME")
    private OffsetDateTime requestTime;

    @Column(name = "RESPONSE_TIME")
    private OffsetDateTime responseTime;

    @Column(name = "RESPONSE")
    @Lob
    private String response;


    public PersonAIAction getAction() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAction(PersonAIAction action) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}