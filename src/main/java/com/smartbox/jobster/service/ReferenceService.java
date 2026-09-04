package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.ref.RefGroup;
import com.smartbox.jobster.entity.ref.Reference;
import io.jmix.core.DataManager;
import io.jmix.core.querycondition.PropertyCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jobster team
 * Since: 6/6/2024 11:52 AM
 */
@Service
public class ReferenceService {
    @Autowired
    private DataManager dataManager;

    public List<Reference> getChildReferences(RefGroup group, Reference parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends ParentRef> T getByCode(Class<T> entityClass, String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends ParentRef> T getOrCreateByName(Class<T> entityClass, String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
