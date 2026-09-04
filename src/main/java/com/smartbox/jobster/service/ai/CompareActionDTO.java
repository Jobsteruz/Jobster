package com.smartbox.jobster.service.ai;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompareActionDTO extends PersonAssistantDTO {
    private final int percent;

    public CompareActionDTO(String html, int percent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
