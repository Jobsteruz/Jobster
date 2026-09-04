package com.smartbox.jobster.view.sequence;

import com.smartbox.jobster.entity.core.Sequence;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "sequences", layout = MainView.class)
@ViewController("jb_Sequence.list")
@ViewDescriptor("sequence-list-view.xml")
public class SequenceListView extends AbstractListView<Sequence> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}