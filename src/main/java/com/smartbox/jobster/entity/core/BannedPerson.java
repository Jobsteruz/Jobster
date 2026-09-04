package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.entity.User;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_BANNED_PERSON", indexes = {
        @Index(name = "IDX_JB_BANNED_PERSON_BY", columnList = "BY_ID")
})
@Entity(name = "jb_BannedPerson")
@Getter
@Setter
public class BannedPerson extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 6968094209113857612L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "CHAT_ID")
    private Long chatId;

    @Column(name = "PHONE")
    private String phone;

    @JoinColumn(name = "BY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User by;

    @Column(name = "REASON")
    @Lob
    private String reason;
}