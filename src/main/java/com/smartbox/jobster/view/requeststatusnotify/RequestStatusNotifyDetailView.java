package com.smartbox.jobster.view.requeststatusnotify;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.RequestStatusNotify;
import com.smartbox.jobster.entity.hrm.VacancyUser;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

@Route(value = "request-status-notifies/:id", layout = MainView.class)
@ViewController(id = "jb_RequestStatusNotify.detail")
@ViewDescriptor(path = "request-status-notify-detail-view.xml")
@EditedEntityContainer("requestStatusNotifyDc")
@DialogMode(width = "40em", height = "AUTO")
public class RequestStatusNotifyDetailView extends AbstractDetailView<RequestStatusNotify> {

    @ViewComponent
    private EntityComboBox<AutoFillTemplate> templateField;
    @ViewComponent
    private RichTextEditor messageField;
    @ViewComponent
    private JmixCheckboxGroup<Platform> platforms;
    @ViewComponent
    private JmixButton showEmployeesBtn;

    @Autowired
    private DialogWindows dialogWindows;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("templateField")
    public void onTemplateFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<AutoFillTemplate>, AutoFillTemplate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("userField")
    public void onUserFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<VacancyUser>, VacancyUser> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "showEmployeesBtn", subject = "clickListener")
    public void onShowEmployeesBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
