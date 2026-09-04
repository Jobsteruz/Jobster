package com.smartbox.jobster.view.position.type;

import com.smartbox.jobster.entity.hrm.PositionType;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "positionTypes", layout = MainView.class)
@ViewController(id = "jb_PositionType.list")
@ViewDescriptor(path = "position-type-list-view.xml")
public class PositionTypeListView extends AbstractListView<PositionType> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}