package com.smartbox.jobster.view.mapping;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.event.ReloadListViewEvent;
import com.smartbox.jobster.service.MappingService;
import io.jmix.flowui.UiEventPublisher;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;
import io.jmix.flowui.view.View;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EntityMappingTask extends BackgroundTask<Integer, Void> {
    private EntityMapping mapping;
    private List data;

    public EntityMappingTask(View view, EntityMapping mapping, List data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Void run(@NotNull TaskLifeCycle<Integer> taskLifeCycle) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void done(Void result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
