package com.smartbox.jobster.service.sso;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.sso.SamlRoleMapping;
import com.smartbox.jobster.entity.sso.SsoProvider;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.core.security.Authenticated;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SsoProviderService {

    private final UnconstrainedDataManager dataManager;

    public SsoProviderService(UnconstrainedDataManager dataManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Optional<SsoProvider> findByDomain(String domain) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Optional<SsoProvider> findByTenantId(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public List<SamlRoleMapping> getRoleMappings(SsoProvider provider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Validates an SCIM Bearer token and returns the TARGET tenant for provisioning.
     * The tenant is derived from the token's linked SSO provider — not the token's own tenantId —
     * so a token works correctly regardless of which admin created it.
     */
    @Authenticated
    public Optional<String> validateScimToken(String bearerToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
