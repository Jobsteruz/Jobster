package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@JmixEntity
@Table(name = "JB_AI_CALL")
@Entity(name = "jb_AiCall")
public class AiCall extends StandardTenantEntity implements Serializable {
    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(name = "COMPANY_NUMBER", nullable = false)
    private String companyNumber;

    @NotNull
    @Column(name = "USER_ID", nullable = false)
    private String userId;


    @Column(name = "PERSON_NAME")
    private String personName;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "WELCOME_TEXT", length = 1000)
    private String welcomeText;

    @Column(name = "GOODBYE_TEXT", length = 1000)
    private String goodbyeText;

    @Column(name = "TRY_COUNT")
    private Integer tryCount;

    @NotNull
    @Column(name = "EXTERNAL_CALL_ID", nullable = false)
    private Integer externalCallId;

    @Column(name = "PROMPT", length = 5000)
    private String prompt;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "AUDIO_PATH", length = 1000)
    private String audioPath;

    @Column(name = "AUDIO_URL", length = 2000)
    private String audioUrl;

    @Lob
    @Column(name = "CALL_DATA_JSON")
    private String callDataJson;

    @OneToMany(mappedBy = "aiCall", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AiCallMessage> messages;

    @OneToMany(mappedBy = "aiCall", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AiCallQuestion> questions;

    @Column(name = "AUDIO_FILE", length = 1024)
    private FileRef audioFile;

    public UUID getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setId(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}