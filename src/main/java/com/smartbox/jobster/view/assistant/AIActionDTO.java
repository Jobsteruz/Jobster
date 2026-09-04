package com.smartbox.jobster.view.assistant;

import java.util.List;

public record AIActionDTO(String entity, String action, List<EntityField> fields, List<EntityField> filters) {
}