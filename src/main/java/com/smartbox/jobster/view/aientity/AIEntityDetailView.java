package com.smartbox.jobster.view.aientity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ai.AIEntity;
import com.smartbox.jobster.entity.ai.AIField;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.view.resourcepolicy.ResourcePolicyViewUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "a-i-entities/:id", layout = MainView.class)
@ViewController(id = "jb_AIEntity.detail")
@ViewDescriptor(path = "ai-entity-detail-view.xml")
@EditedEntityContainer("aIEntityDc")
public class AIEntityDetailView extends AbstractDetailView<AIEntity> {
    @ViewComponent
    private JmixComboBox<MetaClass> entityNameField;
    @ViewComponent
    private JmixComboBox<String> listViewIdField;
    @ViewComponent
    private JmixComboBox<String> detailViewIdField;

    @Autowired
    private MessageTools messageTools;
    @Autowired
    private ViewService viewService;
    @Autowired
    private ResourcePolicyViewUtils resourcePolicyViewUtils;
    @Autowired
    private Metadata metadata;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "fieldsDataGrid.create", subject = "viewConfigurer")
    private void fieldsDataGridCreateViewConfigurer(final AIFieldDetailView view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "fieldsDataGrid.edit", subject = "viewConfigurer")
    private void fieldsDataGridEditViewConfigurer(final AIFieldDetailView view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "listViewIdField", subject = "itemLabelGenerator")
    private String listViewIdFieldItemLabelGenerator(final String item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "detailViewIdField", subject = "itemLabelGenerator")
    private String detailViewIdFieldItemLabelGenerator(final String item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityNameField", subject = "itemLabelGenerator")
    private String entityNameFieldItemLabelGenerator(final MetaClass item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}