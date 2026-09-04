package com.smartbox.jobster.view.position;

import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.view.PositionDepartmentView;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "positions/:id", layout = MainView.class)
@ViewController("jb_Position.detail")
@ViewDescriptor("position-detail-view.xml")
@EditedEntityContainer("positionDc")
@DialogMode(width = "40em", height = "AUTO")
public class PositionDetailView extends AbstractDetailView<Position> {
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private DataManager dataManager;
    private final SaveContext saveContext = new SaveContext();
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "showDepartmentsBtn", subject = "clickListener")
    public void onShowDepartmentsBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}