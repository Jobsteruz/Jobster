package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.vision.ManualAttendLock;
import com.smartbox.jobster.service.attendance.ManualAttendLockService;
import io.jmix.core.DataManager;
import io.jmix.core.Id;
import io.jmix.core.event.EntityChangedEvent;
import io.jmix.core.event.EntityChangedEvent.Type;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import java.time.LocalDate;

/**
 * @author Jobster team
 * Since: 12/13/2023 3:20 PM
 */
@Component
public class ManualAttendLockEventListener {

    @Autowired
    private ManualAttendLockService lockService;

    @Autowired
    private DataManager dataManager;

    @TransactionalEventListener
    public void onManualAttendLockChangedAfterCommit(final EntityChangedEvent<ManualAttendLock> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    void cacheEvictLock(EntityChangedEvent<ManualAttendLock> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Nullable
    private ManualAttendLock loadLock(Id<ManualAttendLock> lockId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
