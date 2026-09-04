package com.smartbox.jobster.service.ai;

import com.google.genai.types.Content;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletionMessageParam;
import com.openai.models.chat.completions.ChatCompletionTool;
import com.smartbox.jobster.entity.ai.AiUsageFeature;
import lombok.*;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AIConfig {
    private String userPrompt;
    private String systemPrompt;
    private ChatModel gptModel;
    private GroqModel groqModel;
    private GeminiModel geminiModel;
    private Double temperature;
    private Double topP;
    private Integer maxTokens;
    private Consumer<String> onTokenReceived;
    private Consumer<String> onToolsReceived;
    private Runnable onComplete;
    private Consumer<Exception> onError;
    private ChatCompletionTool tool;
    private List<ChatCompletionMessageParam> history;
    private List<Content> geminiHistory;
    private Integer keepLastN;
    private UUID chatId;
    private String dataStoreId;
    private AiUsageFeature feature;
    private String callerTenantId;
    private String callerUsername;
}


