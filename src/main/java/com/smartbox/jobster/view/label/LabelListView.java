package com.smartbox.jobster.view.label;

import com.smartbox.jobster.entity.ats.Label;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "labels", layout = MainView.class)
@ViewController(id = "jb_Label.list")
@ViewDescriptor(path = "label-list-view.xml")
public class LabelListView extends AbstractListView<Label> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}