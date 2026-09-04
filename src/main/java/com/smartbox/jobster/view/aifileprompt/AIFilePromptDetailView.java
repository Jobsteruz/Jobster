package com.smartbox.jobster.view.aifileprompt;

import com.smartbox.jobster.entity.ai.AIFilePrompt;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "a-i-file-prompts/:id", layout = MainView.class)
@ViewController(id = "jb_AIFilePrompt.detail")
@ViewDescriptor(path = "ai-file-prompt-detail-view.xml")
@EditedEntityContainer("aIFilePromptDc")
public class AIFilePromptDetailView extends AbstractDetailView<AIFilePrompt> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}