package com.smartbox.jobster.view.reports.finishedwithunfinished;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Locale;

@Route(value = "finished-with-unfinished-view", layout = MainView.class)
@ViewController("jb_FinishedWithUnfinishedView")
@ViewDescriptor("finished-with-unfinished-view.xml")
public class FinishedWithUnfinishedView extends AbstractHasPeriodReport {

    @Autowired
    private ApplicantService applicantService;

    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private JmixSelect<Bot> bots;
    @ViewComponent
    private CollectionContainer<Bot> botsDc;
    @ViewComponent
    private Span startedValue;
    @ViewComponent
    private Span finishedValue;
    @ViewComponent
    private CollectionLoader<Bot> botsDl;
    @ViewComponent
    private KeyValueCollectionContainer reportContainer;


    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("bots")
    public void onBotsComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "bots", subject = "itemLabelGenerator")
    private String botsItemLabelGenerator(final Bot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}