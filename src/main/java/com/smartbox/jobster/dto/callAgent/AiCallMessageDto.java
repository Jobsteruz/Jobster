package com.smartbox.jobster.dto.callAgent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AiCallMessageDto {
    private String text;

    private Integer id;

    @JsonProperty("audio_path")
    private String audioPath;

    @JsonProperty("call_id")
    private Integer callId;

    private String role;

    private List<AiCallPartDto> parts;

    @JsonProperty("audio_url")
    private String audioUrl;
}
