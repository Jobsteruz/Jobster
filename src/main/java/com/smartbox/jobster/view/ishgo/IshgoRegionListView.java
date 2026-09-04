package com.smartbox.jobster.view.ishgo;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.integration.ishgo.IshgoRegion;
import com.smartbox.jobster.service.ishgo.IshGOMappingService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.backgroundtask.BackgroundTaskHandler;
import io.jmix.flowui.backgroundtask.BackgroundWorker;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;


@Route(value = "ishgo-regions", layout = MainView.class)
@ViewController(id = "jb_IshgoRegion.list")
@ViewDescriptor(path = "ishgo-region-list-view.xml")
@DialogMode(width = "64em")
public class IshgoRegionListView extends AbstractNavigationListView<IshgoRegion> {
    @Autowired
    private IshGOMappingService ishGOMappingService;
    @Autowired
    private BackgroundWorker backgroundWorker;
    @Autowired
    private Messages messages;

    @ViewComponent
    private JmixButton sync;
    @ViewComponent
    private CollectionLoader<IshgoRegion> entityDl;


    @Subscribe(id = "sync", subject = "clickListener")
    public void onSyncClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<IshgoRegion> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}