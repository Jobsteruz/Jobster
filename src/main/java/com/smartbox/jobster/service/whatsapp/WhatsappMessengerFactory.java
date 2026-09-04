package com.smartbox.jobster.service.whatsapp;

import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("jb_WhatsappMessengerFactory")
public class WhatsappMessengerFactory {

    @Autowired
    private BeanFactory beanFactory;


    public WhatsappMessengerService getMessenger(WhatsappBot bot){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
