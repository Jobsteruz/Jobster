package com.smartbox.jobster.view.excel;


import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Route(value = "excel-view", layout = MainView.class)
@ViewController("jb_ExcelView")
@ViewDescriptor("excel-view.xml")
public class ExcelView extends StandardView {
    @Getter
    @Setter
    private List<String> headerValues;
    @Getter
    @Setter
    private Class<? extends JbEntity<UUID>> entityClass;
    @Getter
    @Setter
    private HashMap<String, String> values = new HashMap<>();

    @Autowired
    private Metadata metadata;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private MessageTools messageTools;
    @ViewComponent
    private VerticalLayout excelHeaderBox;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}