package com.smartbox.jobster.config;

import com.smartbox.jobster.security.specific.UiMenuEnabled;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.UserService;
import io.jmix.flowui.kit.component.main.ListMenu;
import io.jmix.flowui.menu.ListMenuBuilder;
import io.jmix.flowui.menu.MenuConfig;
import io.jmix.flowui.menu.MenuItem;
import io.jmix.flowui.menu.provider.MenuConfigListMenuItemProvider;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component("jb_MenuConfigListMenuItemProvider")
@Primary
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class JbMenuConfigListMenuItemProvider extends MenuConfigListMenuItemProvider {

    private final UserService userService;
    private final RoleService roleService;

    public JbMenuConfigListMenuItemProvider(MenuConfig menuConfig, ObjectProvider<ListMenuBuilder> menuBuilderFactory, UserService userService, RoleService roleService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected List<ListMenu.MenuItem> convertToMenuItems(Collection<MenuItem> menuConfigItems) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
