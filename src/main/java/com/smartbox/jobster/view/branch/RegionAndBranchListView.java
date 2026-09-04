package com.smartbox.jobster.view.branch;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.Branch;
import com.smartbox.jobster.entity.core.DocumentationUrlEnum;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.security.specific.UiEditGenericFilterEnabled;
import com.smartbox.jobster.service.BranchService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.grid.GridSelectionModel;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.TreeDataGrid;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "regionsAndBranches", layout = MainView.class)
@ViewController("jb_Region_And_jb_Branch.list")
@ViewDescriptor("region-and-branch-list-view.xml")
@LookupComponent("regionsDataGrid")
@DialogMode(width = "64em")
public class RegionAndBranchListView extends AbstractNavigationListView<Branch> {
    private String query;

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private BranchService branchService;
    @ViewComponent
    private MessageBundle messageBundle;

    @ViewComponent
    private CollectionLoader<Branch> branchesDl;
    @ViewComponent
    private TreeDataGrid<Region> regionsDataGrid;
    @ViewComponent
    private DataGrid<Branch> branchesDataGrid;
    @ViewComponent
    private SettingsFacet settings;
    @ViewComponent
    private GenericFilter genericFilter;
    @ViewComponent
    private CollectionLoader<Region> regionsDl;
    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private Timer timer;
    @ViewComponent
    private CollectionContainer<Region> regionsDc;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void startTimer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regionsDataGrid")
    public void onRegionsDataGridItemClick(final ItemClickEvent<Region> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchesDataGrid")
    public void onBranchesDataGridItemClick(final ItemClickEvent<Branch> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "branchesDataGrid.create", subject = "initializer")
    private void branchesDataGridCreateInitializer(final Branch branch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "branchesDataGrid.create", subject = "afterSaveHandler")
    private void branchesDataGridCreateAfterSaveHandler(final Branch branch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchesDataGrid.clone")
    public void onBranchesDataGridClone(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<Branch> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<Branch> getFilterDataLoader() {
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
