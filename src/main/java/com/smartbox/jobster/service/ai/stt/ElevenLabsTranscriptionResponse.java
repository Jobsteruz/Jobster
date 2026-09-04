package com.smartbox.jobster.service.ai.stt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElevenLabsTranscriptionResponse {

    @JsonProperty("text")
    private String text;

    @JsonProperty("language_code")
    private String languageCode;

    @JsonProperty("words")
    private List<Word> words;

    @JsonProperty("segments")
    private List<Segment> segments;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Word {
        @JsonProperty("text")
        private String text;

        @JsonProperty("start")
        private Double start;

        @JsonProperty("end")
        private Double end;

        @JsonProperty("speaker")
        private Integer speaker;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Segment {
        @JsonProperty("text")
        private String text;

        @JsonProperty("start")
        private Double start;

        @JsonProperty("end")
        private Double end;

        @JsonProperty("speaker")
        private Integer speaker;
    }
}