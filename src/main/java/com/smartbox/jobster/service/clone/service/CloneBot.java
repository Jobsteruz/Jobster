package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.entity.tg.MenuRole;
import com.smartbox.jobster.entity.tg.Post;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import com.smartbox.jobster.service.tg.MenuService;
import io.jmix.core.SaveContext;

import java.util.List;

/**
 * @author Jobster team
 * Since: 7/7/2024 12:49 PM
 */
public class CloneBot extends AbstractCloning implements CloneBuilder {
    MenuService menuService;

    public CloneBot(CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void cloning() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneMenus(Bot sourceBot, Bot bot, Menu sourceParent, Menu parent, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clonePosts(Menu sourceMenu, Menu menu, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneRoles(Menu sourceMenu, Menu menu, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
