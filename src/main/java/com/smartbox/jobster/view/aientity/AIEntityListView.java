package com.smartbox.jobster.view.aientity;

import com.smartbox.jobster.entity.ai.AIEntity;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "ai-entities", layout = MainView.class)
@ViewController(id = "jb_AIEntity.list")
@ViewDescriptor(path = "ai-entity-list-view.xml")
@DialogMode(width = "64em")
public class AIEntityListView extends AbstractListView<AIEntity> {

    @ViewComponent
    private MessageBundle messageBundle;


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}