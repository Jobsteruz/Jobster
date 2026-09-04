package com.smartbox.jobster.entity.tg;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TG_CHANNEL", indexes = {
        @Index(name = "IDX_JB_TG_CHANNEL_BOT", columnList = "BOT_ID"),
        @Index(name = "IDX_JB_TG_CHANNEL_LANGUAGE", columnList = "LANGUAGE_ID"),
})
@Entity(name = "jb_TgChannel")
@Getter
@Setter
public class TgChannel extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 7094161649575628108L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOT_ID")
    private Bot bot;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LANGUAGE_ID")
    private Language language;

    @Column(name = "REAL_NAME", length = 1024)
    private String realName;

    @Column(name = "CHAT_ID")
    private Long chatId;

    @Column(name = "LINK", length = 1024)
    private String link;
}