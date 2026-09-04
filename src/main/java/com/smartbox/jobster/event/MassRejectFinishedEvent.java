package com.smartbox.jobster.event;

import com.smartbox.jobster.pojo.MassRejectResult;
import org.springframework.context.ApplicationEvent;

public class MassRejectFinishedEvent extends ApplicationEvent {

    public MassRejectFinishedEvent(MassRejectResult result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MassRejectResult getSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
