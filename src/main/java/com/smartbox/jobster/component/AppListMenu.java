package com.smartbox.jobster.component;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLink;
import io.jmix.flowui.component.main.JmixListMenu;
import io.jmix.flowui.kit.component.main.ListMenu;
import lombok.Getter;

public class AppListMenu extends JmixListMenu {

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected RouterLink createMenuItemComponent(ListMenu.MenuItem menuItem) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Getter
    public static class BadgeMenuItem extends JmixListMenu.MenuItem {
        protected String badge;
        protected String url;

        public BadgeMenuItem(String id) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public BadgeMenuItem withBadge(String badge) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public BadgeMenuItem withUrl(String url) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}
