package com.smartbox.jobster.view.aientity.aientitylimit;

import com.smartbox.jobster.entity.ai.AIEntityLimit;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "a-i-entity-limits", layout = MainView.class)
@ViewController(id = "jb_AIEntityLimit.list")
@ViewDescriptor(path = "ai-entity-limit-list-view.xml")
@DialogMode(width = "64em")
public class AIEntityLimitListView extends AbstractListView<AIEntityLimit> {

    @ViewComponent
    private MessageBundle messageBundle;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}