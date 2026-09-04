package com.smartbox.jobster.view.exitemployee;

import com.smartbox.jobster.entity.hrm.ExitEmployee;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.Supply;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "exitEmployees", layout = MainView.class)
@ViewController("jb_ExitEmployee.list")
@ViewDescriptor("exit-employee-list-view.xml")
public class ExitEmployeeListView extends AbstractListView<ExitEmployee> {


    @Supply(to = "entityDataGrid.employeeSurvey", subject = "renderer")
    private Renderer<ExitEmployee> entityDataGridEmployeeSurveyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.managerSurvey", subject = "renderer")
    private Renderer<ExitEmployee> entityDataGridManagerSurveyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}