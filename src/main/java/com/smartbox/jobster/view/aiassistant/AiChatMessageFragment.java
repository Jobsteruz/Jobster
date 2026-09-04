package com.smartbox.jobster.view.aiassistant;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.dto.MassSendingAiResponse;
import com.smartbox.jobster.entity.ai.AIChat;
import com.smartbox.jobster.entity.ai.AIChatMessage;
import com.smartbox.jobster.entity.ai.AIResponseType;
import com.smartbox.jobster.entity.config.AiAssistantSettings;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.service.ai.AIConfig;
import com.smartbox.jobster.service.ai.AiAssistantService;
import com.smartbox.jobster.service.ai.AiSummarizer;
import com.smartbox.jobster.service.ai.GroqAIService;
import com.smartbox.jobster.service.ai.aisearch.ApplicantAISearchService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.EntitySerialization;
import io.jmix.core.EntityStates;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.virtuallist.JmixVirtualList;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionPropertyContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.smartbox.jobster.component.ComponentUtils.createButton;
import static com.smartbox.jobster.component.ComponentUtils.createHbox;

public class AiChatMessageFragment extends VerticalLayout {
    private static final Logger log = LoggerFactory.getLogger(AiChatMessageFragment.class);

    private AIChatMessage chatMessage;
    private JmixVirtualList<AIChatMessage> messagesBox;
    private CollectionPropertyContainer<AIChatMessage> messagesDc;

    private final StringBuilder sb = new StringBuilder();
    // Raw accumulator for streamed natural-text tokens. We sanitize the FULL raw buffer on each
    // append (instead of re-reading already-sanitized DOM) so partial tags split across tokens
    // render correctly instead of leaking as visible "</p>" fragments.
    private final StringBuilder htmlBuffer = new StringBuilder();
    private VerticalLayout messageDiv;
    private AIConfig config;
    private boolean isAiMsg;
    private AiAssistant view;
    private Div thinkingIndicator;
    private boolean hasReceivedResponse = false;

    private final String massSystemPrompt;
    private final String mehnatCodexPrompt;
    private final String applicantSearchPrompt;
    private final String applicantSearchResultPrompt;

    private AiAssistantService aiAssistantService;
    private GroqAIService groqAIService;
    private EntitySerialization entitySerialization;
    protected UiComponents uiComponents;
    private EntityStates entityStates;
    private EntityService entityService;
    private AppSettings appSettings;
    private AiSummarizer aiSummarizer;
    private ApplicantAISearchService applicantAISearchService;
    private Messages messages;
    private LanguageService languageService;

    private Div aiImg;
    private HorizontalLayout footerAI;
    private HorizontalLayout footerUser;
    private VerticalLayout editBox;
    private JmixTextArea input;
    private JmixButton helperButton;
    private JmixButton copyAI;
    private JmixButton copyUser;
    private JmixButton tickAI;
    private JmixButton tickUser;


    public AiChatMessageFragment() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void beforeShow(AIChatMessage chatMessage, JmixVirtualList<AIChatMessage> messagesBox, CollectionPropertyContainer<AIChatMessage> messagesDc, AiAssistant view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initializeFields(AIChatMessage chatMessage, JmixVirtualList<AIChatMessage> messagesBox,
                                  CollectionPropertyContainer<AIChatMessage> messagesDc, AiAssistant view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void configureMessage(AIChatMessage chatMessage, boolean isAiMsg) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div createThinkingIndicator() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void configureLayout(boolean isAiMsg) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void generateResponseIfNeeded(List<AIChatMessage> messages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUp() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div createAiImage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout createEditBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void onEditClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void onSendClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void onRegenerateClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Integer getMessageIndex() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void parseAndShowHelper(String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void appendToOutput(UI ui, String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void appendToJsonOutput(UI ui, String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void onStreamComplete(UI ui) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void requestNaturalText(UI ui, String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getNaturalTextPrompt(String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveChatMessage(String content, String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void generateChatTitleIfNeeded() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void appendToChatName(AIChat chat, String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void reGenerate(Integer index) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void toggleEditMode(boolean editMode) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void copy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void removeExcessMessages(List<AIChatMessage> messages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getMessageHtml() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initBeans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}