package com.smartbox.jobster.view.reports.utmsourcereport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.TgUtmService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Locale;

@Route(value = "utm-source-report", layout = MainView.class)
@ViewController(id = "jb_UtmSourceReport")
@ViewDescriptor(path = "utm-source-report.xml")
public class UtmSourceReport extends AbstractHasPeriodReport {
    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private CollectionLoader<Bot> botsDl;
    @ViewComponent
    private JmixSelect<Bot> bots;
    @ViewComponent
    private JmixCheckbox returnees;
    @ViewComponent
    private Span allCount;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private CollectionContainer<Bot> botsDc;

    @Autowired
    private TgUtmService tgUtmService;
    @ViewComponent
    private JmixCheckbox completedQuestionnaire;
    @ViewComponent
    private JmixCheckbox hired;


    @Override
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("bots")
    public void onBotsComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "returnees", subject = "clickListener")
    public void onReturneesClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "completedQuestionnaire", subject = "clickListener")
    public void onCompletedQuestionnaireClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "hired", subject = "clickListener")
    public void onHiredClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    private UtmSourceFilter buildFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isChecked(JmixCheckbox checkbox) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}