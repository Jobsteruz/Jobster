package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.security.IpWhitelist;
import com.smartbox.jobster.service.IpWhitelistService;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class IpWhitelistEventListener {
    @Autowired
    private IpWhitelistService ipWhitelistService;

    @TransactionalEventListener
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void onIpWhitelistChangedAfterCommit(EntityChangedEvent<IpWhitelist> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
