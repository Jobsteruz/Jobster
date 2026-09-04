package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "AI_ASSISTANT_SETTINGS")
@Entity
@Getter
@Setter
public class AiAssistantSettings extends AppSettingsEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -8014996418880931635L;

    @Column(name = "MASS_SENDING_PROMPT")
    @Lob
    private String massSendingPrompt;

    @Column(name = "MEHNAT_CODEX_PROMPT")
    @Lob
    private String mehnatCodexPrompt;

    @Column(name = "APPLICANT_SEARCH_PROMPT")
    @Lob
    private String applicantSearchPrompt;

    @Column(name = "APPLICANT_SEARCH_RESULT_PROMPT")
    @Lob
    private String applicantSearchResultPrompt;
}
