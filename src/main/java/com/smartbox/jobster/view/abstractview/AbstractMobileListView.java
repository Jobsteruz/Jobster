package com.smartbox.jobster.view.abstractview;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.genericfilter.Configuration;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;

@Route(value = "abstract-mobile-list-view", layout = MainView.class)
@ViewController("jb_AbstractMobileListView")
@ViewDescriptor("abstract-mobile-list-view.xml")
public abstract class AbstractMobileListView<E> extends AbstractNavigationListView<E> {
    private static final Logger log = LoggerFactory.getLogger(AbstractMobileListView.class);

    private String query;
    public Locale locale;

    @ViewComponent
    public CollectionLoader<E> entityDl;
    @ViewComponent
    public CollectionContainer<E> entityDc;
    @ViewComponent
    public H2 viewTitle;
    @ViewComponent
    protected Timer timer;
    @ViewComponent
    public VerticalLayout layout;
    @ViewComponent
    public HorizontalLayout loader;
    @ViewComponent
    private SettingsFacet settings;
    // Declared as the concrete type so the async-load hooks are reachable. Every <genericFilter>
    // element resolves to CustomGenericFilter anyway — it is the only GenericFilter bean.
    @ViewComponent
    public CustomGenericFilter genericFilter;
    @ViewComponent
    private JmixMultiSelectComboBox<Object> filter;
    @ViewComponent
    private Icon filterBtn;

    @Autowired
    public CurrentAuthentication currentAuthentication;
    @Autowired
    public ViewNavigators viewNavigators;
    @Autowired
    public DialogWindows dialogWindows;

    public abstract String title();

    @Override
    public CollectionLoader<E> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public CollectionLoader<E> getFilterDataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public GenericFilter getGenericFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean asyncFilterLoadInstalled;

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** See {@code AbstractListView#installAsyncFilterLoad} — keeps the list SELECT off the UI thread. */
    private void installAsyncFilterLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Runs on the UI thread once the rows have reached the container. Subclasses that build their
     * content from the loaded data must hook in here rather than after
     * {@link #onTimerTimerAction}: the load is asynchronous now, so the container is still empty
     * when that method returns.
     */
    protected void afterListLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "createBtn", subject = "clickListener")
    public void onCreateBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setParam(String name, Object value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setLikeParam(String name, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getAdditionalQuestionnaireCode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}