package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasCode;
import com.smartbox.jobster.entity.core.Sequence;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.Metadata;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Jobster team
 * date: 11/07/24 19:01
 */

@Service("jb_GenCodeService")
public class GenCodeService {

    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private Metadata metadata;
    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public <T extends HasCode> String currentCode(T entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public <T extends HasCode> String currentCode(T entity, String property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public <T extends HasCode> String nextCode(T entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public <T extends HasCode> String nextCode(T entity, String property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    @NonNull
    protected <T extends HasCode> Sequence getSequenceByEntity(T entity, String property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends HasCode> String resolveDomain(T entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
