package com.smartbox.jobster.dto.callAgent;

import lombok.Data;

import java.util.List;

@Data
public class AiCallResponseDto {
    private List<AiCallDataDto> data;
}
