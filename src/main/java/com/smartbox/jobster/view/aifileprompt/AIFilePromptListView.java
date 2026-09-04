package com.smartbox.jobster.view.aifileprompt;

import com.smartbox.jobster.entity.ai.AIFilePrompt;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "a-i-file-prompts", layout = MainView.class)
@ViewController(id = "jb_AIFilePrompt.list")
@ViewDescriptor(path = "ai-file-prompt-list-view.xml")
@DialogMode(width = "64em")
public class AIFilePromptListView extends AbstractListView<AIFilePrompt> {

    @ViewComponent
    private MessageBundle messageBundle;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}