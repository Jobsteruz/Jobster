package com.smartbox.jobster.service.ai;

import lombok.Getter;

@Getter
public enum GroqModel {
    CHAT_GPT("openai/gpt-oss-120b"),
    LLAMA_3_3_70B("llama-3.3-70b-versatile");

    private final String id;

    GroqModel(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
