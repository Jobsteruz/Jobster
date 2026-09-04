package com.smartbox.jobster.service.whatsapp;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.FetchPlans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@Service
public class WhatsappUserService {


    private final WhatsappMessengerFactory whatsappMessengerFactory;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityService entityService;
    @Autowired
    private FetchPlans fetchPlans;

    public WhatsappUserService(WhatsappMessengerFactory whatsappMessengerFactory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappUser getOrCreateUser(WhatsappBot bot, String phoneNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean sendMessage(WhatsappUser user, String text, @Nullable FileType fileType,
                               @Nullable String fileUrl, @Nullable String fileId, @Nullable String filename) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
