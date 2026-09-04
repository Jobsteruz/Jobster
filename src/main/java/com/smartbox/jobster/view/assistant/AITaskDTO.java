package com.smartbox.jobster.view.assistant;

import java.util.List;

public record AITaskDTO(List<AIActionDTO> entities, String errorMessage, String extraResponse) {
}