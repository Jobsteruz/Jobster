package com.smartbox.jobster.view.position;

import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.integration.ishgo.IshgoPosition;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.view.abstractview.AbstractMasterView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;

@Route(value = "positionsMaster", layout = MainView.class)
@ViewController("jb_Position.master")
@ViewDescriptor("position-master-view.xml")
@LookupComponent("entitiesDataGrid")
@DialogMode(width = "64em")
public class PositionMasterView extends AbstractMasterView<Position> {
    @ViewComponent
    private CodeField codeField;

    @ViewComponent
    private JmixSelect<FileType> fileTypeField;

    @Subscribe
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "ishgoPositionField", subject = "itemLabelGenerator")
    private String ishgoPositionFieldItemLabelGenerator(final IshgoPosition ishgoPosition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onEntitiesDataGridCreate(ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onEntitiesDataGridDataGridItemClick(ItemClickEvent<Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}