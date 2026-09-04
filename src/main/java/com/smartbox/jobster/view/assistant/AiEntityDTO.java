package com.smartbox.jobster.view.assistant;

import java.util.List;

public record AiEntityDTO(String entityKey, String meaning, List<AiFieldDTO> fields,
                          Boolean forCreate, Boolean forRead, Boolean forUpdate, Boolean forDelete) {
}
