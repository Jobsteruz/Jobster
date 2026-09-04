package com.smartbox.jobster.view.website.section.vacancy;


import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "Vacancy-dialog-view", layout = MainView.class)
@ViewController("jb_VacancyDialogView")
@ViewDescriptor("Vacancy-dialog-view.xml")
@DialogMode(width = "40em")
@CssImport("./webQur/vacancy-section.css")
public class VacancyDialogView extends StandardView {
    @Setter
    private Page page;
    @Setter
    private Section section;

    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private TypedTextField<Object> title;
    @ViewComponent
    private TypedTextField<Object> shortTitle;
    @ViewComponent
    private JmixIntegerField sortField;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}