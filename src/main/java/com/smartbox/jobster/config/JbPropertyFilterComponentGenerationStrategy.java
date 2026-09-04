package com.smartbox.jobster.config;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Experience;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.Region;
import com.vaadin.componentfactory.TreeComboBox;
import io.jmix.core.Messages;
import io.jmix.core.Metadata;
import io.jmix.core.MetadataTools;
import io.jmix.core.metamodel.datatype.DatatypeRegistry;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaPropertyPath;
import io.jmix.flowui.Actions;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.ComponentGenerationContext;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.factory.EntityFieldCreationSupport;
import io.jmix.flowui.component.factory.PropertyFilterComponentGenerationStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;

@Component("jb_PropertyFilterComponentGenerationStrategy")
@Primary
public class JbPropertyFilterComponentGenerationStrategy extends PropertyFilterComponentGenerationStrategy {

    public JbPropertyFilterComponentGenerationStrategy(UiComponents uiComponents,
                                                       Metadata metadata,
                                                       MetadataTools metadataTools,
                                                       Actions actions,
                                                       DatatypeRegistry datatypeRegistry,
                                                       Messages messages,
                                                       EntityFieldCreationSupport entityFieldCreationSupport,
                                                       ApplicationContext applicationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Entity types whose full table should NOT be loaded eagerly into filter comboboxes.
     * These are populated later by setUpFilterComponents() with properly filtered data.
     * <p>
     * Every type here MUST have a matching dispatch in
     * {@code FilterComboBoxSupport.applyLazyFilterItems}, otherwise its combobox stays empty.
     * Position/User/Applicant were missing originally — a prod thread dump caught the fallthrough
     * to {@code super.createEntityField} loading a whole table on the UI thread for 25 s while
     * the filter configuration was being converted.
     */
    private static final Set<Class<?>> LAZY_ENTITY_TYPES = Set.of(
            Employee.class, Experience.class, KanbanStage.class, Department.class, Vacancy.class,
            Position.class, User.class, Applicant.class
    );

    @Override
    protected com.vaadin.flow.component.Component createEntityField(ComponentGenerationContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}