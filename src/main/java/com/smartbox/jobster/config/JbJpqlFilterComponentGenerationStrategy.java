package com.smartbox.jobster.config;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.CustomGenericFilter;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.data.provider.DataProvider;
import io.jmix.core.*;
import io.jmix.core.metamodel.datatype.DatatypeRegistry;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.flowui.Actions;
import io.jmix.flowui.UiComponentProperties;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.entitypicker.EntityClearAction;
import io.jmix.flowui.action.entitypicker.EntityLookupAction;
import io.jmix.flowui.component.ComponentGenerationContext;
import io.jmix.flowui.component.EntityPickerComponent;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.factory.EntityFieldCreationSupport;
import io.jmix.flowui.component.factory.JpqlFilterComponentGenerationContext;
import io.jmix.flowui.component.factory.JpqlFilterComponentGenerationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component("jb_JpqlFilterComponentGenerationStrategy")
@Primary
public class JbJpqlFilterComponentGenerationStrategy extends JpqlFilterComponentGenerationStrategy {

    private static final Logger log = LoggerFactory.getLogger(JbJpqlFilterComponentGenerationStrategy.class);

    protected final UiComponentProperties componentProperties;
    protected final ApplicationContext applicationContext;

    public JbJpqlFilterComponentGenerationStrategy(UiComponents uiComponents,
                                                   Metadata metadata,
                                                   MetadataTools metadataTools,
                                                   Actions actions,
                                                   DatatypeRegistry datatypeRegistry,
                                                   Messages messages,
                                                   EntityFieldCreationSupport entityFieldCreationSupport,
                                                   UiComponentProperties componentProperties,
                                                   ApplicationContext applicationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected com.vaadin.flow.component.Component createEntityField(ComponentGenerationContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Binds a lazy, paged {@link DataProvider} to comboboxes generated for JPQL filter parameters.
     * <p>
     * On the PropertyFilter path Jmix fills EntityComboBox items itself
     * ({@code EntityFieldCreationSupport} builds a CollectionContainer from the whole table), but the
     * JPQL path builds the component here by hand, so without this the dropdown stays EMPTY for every
     * entity mapped to an EntityComboBox via {@code jmix.ui.component.entity-field-fqn.*} — unless it
     * happens to be one of the types hardcoded in {@code FilterComboBoxSupport#applyLazyFilterItems}
     * (PositionType, Country, Education, RefSource, QuestionOption, … are not).
     * <p>
     * {@code applyLazyFilterItems} still runs afterwards and overrides these items for the entities
     * that need a narrowed subset (Employee by role, Vacancy by state, KanbanStage by kanban, …).
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected void bindDefaultItems(EntityPickerComponent<?> field, MetaClass metaClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void createFieldActions(MetaClass metaClass,
                                      EntityPickerComponent field) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
