package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_AI_CHAT", indexes = {
        @Index(name = "IDX_JB_AI_CHAT_EMPLOYEE", columnList = "EMPLOYEE_ID"),
})
@Entity(name = "jb_AIChat")
@Getter
@Setter
public class AIChat extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1913270871317286141L;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("createdDate desc")
    @OneToMany(mappedBy = "chat")
    private List<AIChatMessage> messages;
}