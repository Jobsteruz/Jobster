package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.security.IpWhitelist;
import io.jmix.core.DataManager;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.web.util.matcher.IpAddressMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class IpWhitelistService {

    private final DataManager dataManager;
    private final SystemAuthenticator systemAuthenticator;

    // Cache to store allowed IPs/Ranges
    private final Set<String> allowedIpsCache = ConcurrentHashMap.newKeySet();

    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        refreshCache();
    }

    /**
     * Checks if the given IP address is allowed.
     * Supports exact match and CIDR notation (e.g. 192.168.1.0/24).
     *
     * @param ipAddress The IP address to check
     * @return true if allowed, false otherwise
     */
    public boolean isIpAllowed(String ipAddress) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Refreshes the IP whitelist cache from the database.
     * Should be called when IpWhitelist entity is changed.
     */
    public void refreshCache() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
