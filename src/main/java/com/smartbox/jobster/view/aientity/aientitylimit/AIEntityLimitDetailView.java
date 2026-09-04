package com.smartbox.jobster.view.aientity.aientitylimit;

import com.smartbox.jobster.entity.ai.AIEntityLimit;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "a-i-entity-limits/:id", layout = MainView.class)
@ViewController(id = "jb_AIEntityLimit.detail")
@ViewDescriptor(path = "ai-entity-limit-detail-view.xml")
@EditedEntityContainer("aIEntityLimitDc")
public class AIEntityLimitDetailView extends AbstractDetailView<AIEntityLimit> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}