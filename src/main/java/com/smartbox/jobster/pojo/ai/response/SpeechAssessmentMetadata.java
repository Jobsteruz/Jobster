package com.smartbox.jobster.pojo.ai.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Jobster team
 * date: 22/05/24 16:04
 */
@Getter
@Setter
public class SpeechAssessmentMetadata implements Serializable {

    private static final long serialVersionUID = -220139056377047762L;

    @SerializedName("total_cost")
    @JsonProperty("total_cost")
    private Double totalCost;

    @SerializedName("llm_name")
    @JsonProperty("llm_name")
    private String llmName;

    @SerializedName("execution_time")
    @JsonProperty("execution_time")
    private Double executionTime;


    @SerializedName("transcription_language")
    @JsonProperty("transcription_language")
    private String transcriptionLanguage;
}
