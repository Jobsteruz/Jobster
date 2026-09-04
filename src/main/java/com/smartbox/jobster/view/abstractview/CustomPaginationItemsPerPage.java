package com.smartbox.jobster.view.abstractview;

import io.jmix.core.Messages;
import io.jmix.flowui.component.pagination.ItemsPerPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CustomPaginationItemsPerPage")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CustomPaginationItemsPerPage extends ItemsPerPage {
    @Autowired
    private Messages messages;

    @Override
    public void setLabelText(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
