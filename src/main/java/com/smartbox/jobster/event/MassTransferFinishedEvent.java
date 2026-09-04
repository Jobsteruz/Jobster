package com.smartbox.jobster.event;

import com.smartbox.jobster.pojo.MassTransferResult;
import org.springframework.context.ApplicationEvent;

public class MassTransferFinishedEvent extends ApplicationEvent {

    public MassTransferFinishedEvent(MassTransferResult result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MassTransferResult getSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
