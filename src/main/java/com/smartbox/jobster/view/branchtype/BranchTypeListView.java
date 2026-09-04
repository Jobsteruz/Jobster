package com.smartbox.jobster.view.branchtype;

import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "branchTypes", layout = MainView.class)
@ViewController("jb_BranchType.list")
@ViewDescriptor("branch-type-list-view.xml")
public class BranchTypeListView extends AbstractListView<BranchType> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}