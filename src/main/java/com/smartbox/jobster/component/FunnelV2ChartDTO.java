package com.smartbox.jobster.component;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class FunnelV2ChartDTO {
    private UUID stageId;
    private String stage;
    private Long count;
    private Double percent;
    private String color;

    public FunnelV2ChartDTO(UUID stageId, String stage, Long count, Double percent, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
