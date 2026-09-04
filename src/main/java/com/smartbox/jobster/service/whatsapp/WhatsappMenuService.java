package com.smartbox.jobster.service.whatsapp;

import com.smartbox.jobster.entity.whatsapp.*;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.FetchPlans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class WhatsappMenuService {

    private final EntityService entityService;
    private final FetchPlans fetchPlans;
    @Autowired
    private DataManager dataManager;

    public WhatsappMenuService(EntityService entityService, FetchPlans fetchPlans) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public Collection<WhatsappMenu> getMenus(WhatsappBot bot, WhatsappMenu parent /*nullable*/) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<WhatsappPost> getPostsByMenu(WhatsappMenu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<WhatsappMenu> getCurrentUserMenus(WhatsappUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappMenu getParentMenu(WhatsappMenu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
