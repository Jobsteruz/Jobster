package com.smartbox.jobster.config;


import io.jmix.core.security.SystemAuthenticator;
import io.jmix.security.model.ResourceRole;
import io.jmix.securitydata.impl.role.provider.DatabaseResourceRoleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 2/12/2025 1:31 PM
 */
@Primary
@Component
public class JbDatabaseResourceRoleProvider extends DatabaseResourceRoleProvider {

    @Autowired
    private SystemAuthenticator systemAuthenticator;

    @Override
    public ResourceRole findRoleByCode(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
