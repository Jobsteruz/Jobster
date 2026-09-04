package com.smartbox.jobster.service.tg;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.*;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/2/2023 4:46 PM
 */
@Service
public class MenuService {

    @Autowired
    private DataManager dataManager;

    public void createDefaultMenuPost(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Menu> getChildMenus(Bot bot, Menu parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Menu getParentMenu(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Menu getById(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean hasChildMenus(Menu parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Post> getPostListByMenu(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isMenuPostType(Menu currentMenu, PostType... postTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isLastPostInlineKeyboard(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<MenuRole> getMenuRoles(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Menu getMenuByPostType(Bot bot, PostType postType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Menu getMenuByCode(Bot bot, String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
