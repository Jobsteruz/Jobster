package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SPEECH_ASSESSMENT_SETTINGS")
@Entity(name = "jb_SpeechAssessmentSettings")
@Getter
@Setter
public class SpeechAssessmentSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = 6193816969974738745L;

    @Secret
    @Column(name = "SPEECH_ASSESSMENT_URL")
    private String speechAssessmentUrl;

    @Secret
    @Column(name = "SPEECH_ASSESSMENT_CALLBACK_URL")
    private String speechAssessmentCallbackUrl;

    @Secret
    @Column(name = "SPEECH_ASSESSMENT_TOKEN")
    private String speechAssessmentToken;

}