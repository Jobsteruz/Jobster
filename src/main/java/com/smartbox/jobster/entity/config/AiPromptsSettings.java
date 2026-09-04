package com.smartbox.jobster.entity.config;

import com.smartbox.jobster.entity.ai.AIFilePrompt;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;


@JmixEntity
@Table(name = "AI_PROMPTS_SETTINGS")
@Entity
@Getter
@Setter
public class AiPromptsSettings extends AppSettingsEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -2709073315146821166L;

    @Column(name = "DOING_TASK_AI")
    @Lob
    private String doingTaskAI;

    @Column(name = "COMPARE_ACTION_PROMPT")
    @Lob
    private String compareActionPrompt;

    @Column(name = "SUMMARY_ACTION_PROMPT")
    @Lob
    private String summaryActionPrompt;

    @Column(name = "AI_ASSISTANT_MASS_SENDING")
    @Lob
    private String aiAssistantMassSending;

    @Column(name = "VACANCY_COMPARE_PROMPT")
    @Lob
    private String vacancyComparePrompt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEHNAT_CODEX_ID")
    private AIFilePrompt mehnatCodex;
}
