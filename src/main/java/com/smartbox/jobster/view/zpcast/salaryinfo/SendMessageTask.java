package com.smartbox.jobster.view.zpcast.salaryinfo;

import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.vaadin.flow.component.UI;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;
import io.jmix.flowui.view.View;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class SendMessageTask extends BackgroundTask<Integer, Long> {
    protected SalaryInfo salaryInfo;
    protected List<SalaryData> salaryDataList;

    public SendMessageTask() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Long run(TaskLifeCycle<Integer> taskLifeCycle){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract Long sendMessage(TaskLifeCycle<Integer> taskLifeCycle);
}
