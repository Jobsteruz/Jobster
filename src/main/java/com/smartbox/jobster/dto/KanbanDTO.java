package com.smartbox.jobster.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
public class KanbanDTO {
    private UUID id;
    private String name;
    private List<KanbanStagesDTO> stages;
}
