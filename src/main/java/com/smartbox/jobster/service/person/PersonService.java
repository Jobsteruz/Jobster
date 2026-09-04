package com.smartbox.jobster.service.person;


import com.google.common.base.Strings;
import com.smartbox.jobster.$;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.core.*;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.DataManager;
import io.jmix.core.FileStorage;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.querycondition.Condition;
import io.jmix.core.querycondition.LogicalCondition;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author Jobster team
 * Since: 9/29/2024 1:04 PM
 */
@Service
public class PersonService {

    @Autowired
    private Metadata metadata;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private FileStorage fileStorage;

    public Person loadByJbEntity(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.FULL_NAME, key = "#person.id", cacheManager = "hazelcastCacheManager")
    public String formatFullName(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getFullName(String entityName, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Language getLanguage(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<PersonLanguage> getPersonLanguages(List<UUID> entityIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isBanned(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isBannedByPhone(String tenantId, String phone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isPersonBanned(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isPersonStatus(String personEntity, UUID personId, PersonStatus... statuses) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Person> List<T> loadDuplicatesByPhone(T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Passport> List<T> loadDuplicatesByPinfl(T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Person> List<T> loadDuplicatesByEmail(T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Person> List<T> loadDuplicatesByTgUser(T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Person> List<T> loadDuplicatesByWhatsappUser(T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Passport> List<T> loadDuplicates(T passport) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
