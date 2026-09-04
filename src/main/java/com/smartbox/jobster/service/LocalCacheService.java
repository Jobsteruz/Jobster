package com.smartbox.jobster.service;

import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.JbEntity;
import io.jmix.core.DataManager;
import io.jmix.core.InstanceNameProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class LocalCacheService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityService entityService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @CacheEvict(value = RedisCacheNames.TRANSLATIONS, key = "#entity.id + '_' + #field + '_' + #locale", cacheManager = "hazelcastCacheManager")
    public void cacheEvictTranslate(JbEntity<UUID> entity, String field, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.TRANSLATIONS, key = "#entity.id + '_' + #field + '_' + #locale", cacheManager = "hazelcastCacheManager")
    public String translate(JbEntity<UUID> entity, String field, String locale, String source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.ROOTED_DEPARTMENT_LABEL, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRootedDepartmentNames(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.ROOTED_DEPARTMENT_LABEL, unless = "#result == null", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public String getRootedDepartmentNames(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.BRANCH_DEPARTMENT_LABEL, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictBranchDepartmentName(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.BRANCH_DEPARTMENT_LABEL, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public String getBranchDepartmentName(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getRootedDepartmentNames(Department department, String names) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String findBranchDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
