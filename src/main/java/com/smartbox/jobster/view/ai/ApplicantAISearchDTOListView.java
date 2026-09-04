package com.smartbox.jobster.view.ai;

import com.smartbox.jobster.$;
import com.smartbox.jobster.dto.ApplicantAISearchDTO;
import com.smartbox.jobster.service.ai.aisearch.ApplicantAISearchService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.settings.ViewSettings;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Route(value = "applicant-ai-search-dtoes", layout = MainView.class)
@ViewController(id = "ApplicantAISearchDTO.list")
@ViewDescriptor(path = "applicant-ai-search-dto-list-view.xml")
@LookupComponent("dataGrid")
@DialogMode(width = "100%", height = "100%")
public class ApplicantAISearchDTOListView extends AbstractNavigationListView<ApplicantAISearchDTO> {
    private int offset = 0;
    private final int limit = 50;

    @Setter
    private List<ApplicantAISearchService.SearchFilter> searchFilters;
    @Getter
    private final List<AiSearchFilterFragment> filterFragments = new ArrayList<>();

    @Autowired
    private Fragments fragments;
    @Autowired
    private ApplicantAISearchService applicantAISearchService;
    @Autowired
    private DialogWindows dialogWindows;

    @ViewComponent("filters")
    private HorizontalLayout filters;
    @ViewComponent
    private CollectionContainer<ApplicantAISearchDTO> applicantAISearchDtoDc;
    @ViewComponent
    private SettingsFacet settings;
    @ViewComponent
    private JmixTextArea prompt;
    @ViewComponent
    private JmixButton search;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addFilter", subject = "clickListener")
    public void onAddFilterClick(final ClickEvent<JmixImage<?>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "search", subject = "clickListener")
    public void onSearchClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "showMoreBtn", subject = "clickListener")
    public void onShowMoreBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("dataGrid")
    public void onDataGridItemDoubleClick(final ItemDoubleClickEvent<ApplicantAISearchDTO> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onDetachEvent(final DetachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeClose(final BeforeCloseEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.birthDate", subject = "renderer")
    private Renderer<ApplicantAISearchDTO> dataGridBirthDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.fillDate", subject = "renderer")
    private Renderer<ApplicantAISearchDTO> dataGridFillDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveSettings() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void promptSearch(String prompt, boolean showMore) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void search(boolean showMore) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
