package com.smartbox.jobster.pojo.event;


import com.smartbox.jobster.AppBeans;
import io.jmix.flowui.UiEventPublisher;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Jobster team
 * Since: 11/28/2024 8:53 PM
 */
public abstract class AbstractEventPojo implements Serializable {

    @Getter
    @Setter
    private Collection<String> usernames;

    private UiEventPublisher uiEventPublisher;

    public abstract void fireEvent();

    protected UiEventPublisher uiEventPublisher() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
