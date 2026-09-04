package com.smartbox.jobster.listener;

import com.smartbox.jobster.event.EntityStageChangedEvent;
import io.jmix.flowui.UiEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component("jb_EntityStageChangedEventListener")
public class EntityStageChangedEventListener {

    @Autowired
    private UiEventPublisher uiEventPublisher;


//    @EventListener
//    public void entityStageChanged(EntityStageChangedEvent event) {
//
//        // publishing event to Jmix UI(s)
//        uiEventPublisher.publishEvent(event);
//    }
}
