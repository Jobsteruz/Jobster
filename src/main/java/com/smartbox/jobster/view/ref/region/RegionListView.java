package com.smartbox.jobster.view.ref.region;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.DocumentationUrlEnum;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.TreeDataGrid;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;

import java.util.List;


@Route(value = "regions", layout = MainView.class)
@ViewController("jb_Region.list")
@ViewDescriptor("region-list-view.xml")
@LookupComponent("childRegionsGrid")
@DialogMode(width = "80%")
public class RegionListView extends AbstractNavigationListView<Region> {
    private String query;

    @ViewComponent
    private CollectionLoader<Region> regionsDl;
    @ViewComponent
    private CollectionContainer<Region> parentDc;

    @ViewComponent
    private TreeDataGrid<Region> parentsGrid;
    @ViewComponent
    private SettingsFacet settings;
    @ViewComponent
    private GenericFilter genericFilter;
    //    @ViewComponent
//    private JmixMultiSelectComboBox<Object> filter;
//    @ViewComponent
//    private Icon filterBtn;
    @ViewComponent
    private DataGrid<Region> childRegionsGrid;
    @ViewComponent
    private CollectionLoader<Region> parentDl;
    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private Timer timer;
    @ViewComponent
    private VerticalLayout childRegionsLayout;

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startTimer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("parentsGrid")
    public void onParentsGridSelection(final SelectionEvent<TreeDataGrid<Region>, Region> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "viewAll", subject = "clickListener")
    public void onViewAllClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "childRegionsGrid.create", subject = "initializer")
    private void resDataGridCreateInitializer(final Region region) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<Region> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<Region> getFilterDataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public GenericFilter getGenericFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "guideBtn", subject = "clickListener")
    public void onGuideBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}