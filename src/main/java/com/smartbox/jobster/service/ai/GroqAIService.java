package com.smartbox.jobster.service.ai;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.chat.completions.*;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.UserIntegration;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class GroqAIService {
    private OpenAIClient client;

    @Autowired
    private AiSummarizer aiSummarizer;


    @PostConstruct
    public void postConstructor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendWithStream(AIConfig config) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
