package com.smartbox.jobster.view.dashboard;


import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.abstractview.AsyncDataLoad;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.model.KeyValueCollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

import java.util.List;
import java.util.function.Supplier;

@Route(value = "exit-interview-report", layout = MainView.class)
@ViewController("jb_ExitInterviewReport")
@ViewDescriptor("exit-interview-report.xml")
public class ExitInterviewReport extends AbstractReportView {
    @ViewComponent
    private KeyValueCollectionLoader exitEmployeeDl;

    /** Fallback for when the loader cannot be prefetched — see {@link #backgroundLoad()}. */
    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Supplier<Runnable> backgroundLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}