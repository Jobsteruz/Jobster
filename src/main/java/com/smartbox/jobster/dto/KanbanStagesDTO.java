package com.smartbox.jobster.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class KanbanStagesDTO {
    private UUID id;
    private String name;
}
