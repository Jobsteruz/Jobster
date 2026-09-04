package com.smartbox.jobster.view.aientity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ai.AIField;
import com.smartbox.jobster.entity.ai.AIFieldType;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "a-i-fields/:id", layout = MainView.class)
@ViewController(id = "jb_AIField.detail")
@ViewDescriptor(path = "ai-field-detail-view.xml")
@EditedEntityContainer("aIFieldDc")
public class AIFieldDetailView extends AbstractDetailView<AIField> {
    @Setter
    private MetaClass metaClass;

    @ViewComponent
    private JmixComboBox<MetaProperty> entityFieldField;

    @Autowired
    private MessageTools messageTools;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityFieldField", subject = "itemLabelGenerator")
    private String entityFieldFieldItemLabelGenerator(final MetaProperty item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}