package com.smartbox.jobster.view.branchtype;

import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "branchTypes/:id", layout = MainView.class)
@ViewController("jb_BranchType.detail")
@ViewDescriptor("branch-type-detail-view.xml")
@EditedEntityContainer("branchTypeDc")
@DialogMode(width = "40em", height = "AUTO")
public class BranchTypeDetailView extends AbstractDetailView<BranchType> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}