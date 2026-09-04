package com.smartbox.jobster.dto.callAgent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AiCallPartDto {
    private String text;

    private String thought;

    @JsonProperty("file_data")
    private Object fileData;

    @JsonProperty("inline_data")
    private Object inlineData;

    @JsonProperty("function_call")
    private Object functionCall;

    @JsonProperty("video_metadata")
    private Object videoMetadata;

    @JsonProperty("executable_code")
    private Object executableCode;

    @JsonProperty("function_response")
    private Object functionResponse;

    @JsonProperty("thought_signature")
    private Object thoughtSignature;

    @JsonProperty("code_execution_result")
    private Object codeExecutionResult;
}
