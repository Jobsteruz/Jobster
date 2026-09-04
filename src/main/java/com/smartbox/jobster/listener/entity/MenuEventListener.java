package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.service.tg.MenuService;
import io.jmix.core.DataManager;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 12/2/2023 4:44 PM
 */
@Component
public class MenuEventListener {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private MenuService menuService;

    @EventListener
    void onMenuChangedBeforeCommit(EntityChangedEvent<Menu> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
