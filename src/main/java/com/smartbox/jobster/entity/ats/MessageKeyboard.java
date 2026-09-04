package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_MESSAGE_KEYBOARD", indexes = {
        @Index(name = "IDX_JB_MESSAGE_KEYBOARD_MESSAGE", columnList = "MESSAGE_ID")
})
@Entity(name = "jb_MessageKeyboard")
@Getter
@Setter
public class MessageKeyboard extends StandardTenantEntity implements HasSort, Serializable {
    private static final long serialVersionUID = -9131932819237605126L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "MESSAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Message message;

    @Column(name = "TEXT")
    @InstanceName
    private String text;

    @Column(name = "URL")
    private String url;

    @Column(name = "SORT")
    private Integer sort;
}