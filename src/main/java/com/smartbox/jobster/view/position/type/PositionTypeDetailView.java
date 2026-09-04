package com.smartbox.jobster.view.position.type;

import com.smartbox.jobster.entity.hrm.PositionType;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "positionTypes/:id", layout = MainView.class)
@ViewController(id = "jb_PositionType.detail")
@ViewDescriptor(path = "position-type-detail-view.xml")
@EditedEntityContainer("positionTypeDc")
@DialogMode(width = "40em", height = "AUTO")
public class PositionTypeDetailView extends AbstractDetailView<PositionType> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}