package com.smartbox.jobster.view.request.editor;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.grid.editor.EditorSaveEvent;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.view.Install;
import io.jmix.flowui.view.Supply;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "request-editor", layout = MainView.class)
@ViewController(id = "jb_RequestEditor.list")
@ViewDescriptor(path = "request-editor-view.xml")
public class RequestEditorView extends AbstractListView<Vacancy> {


    @Autowired
    private DataManager dataManager;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.condition", subject = "renderer")
    private Renderer<Vacancy> entityDataGridConditionRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.requirement", subject = "renderer")
    private Renderer<Vacancy> entityDataGridRequirementRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.responsibility", subject = "renderer")
    private Renderer<Vacancy> entityDataGridResponsibilityRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.priority", subject = "renderer")
    private Renderer<Vacancy> entityDataGridPriorityRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.requestStatus", subject = "renderer")
    private Renderer<Vacancy> entityDataGridRequestStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.@editor", subject = "saveListener")
    private void entityDataGridEditorSaveListener(final EditorSaveEvent<Object> editorSaveEvent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}