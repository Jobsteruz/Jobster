package com.smartbox.jobster.config.security;

import com.hazelcast.map.IMap;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cleans up Hazelcast shared auth when an HttpSession is destroyed (logout or timeout).
 * <p>
 * When a user logs out, Vaadin invalidates the HttpSession. This listener removes the
 * auth token from Hazelcast IMap so other instances won't restore a stale session.
 * Also removes the user→token mapping to keep sessionUserToken consistent.
 * The browser cookie (JB_AUTH) is cleaned up by {@link HazelcastAuthShareFilter}
 * on the next request (when it finds no data in Hazelcast for the cookie token).
 */
public class HazelcastSessionCleanupListener implements HttpSessionListener {

    private static final Logger log = LoggerFactory.getLogger(HazelcastSessionCleanupListener.class);

    private final IMap<String, byte[]> sessionAuth;
    private final IMap<String, String> sessionUserToken;

    public HazelcastSessionCleanupListener(IMap<String, byte[]> sessionAuth,
                                           IMap<String, String> sessionUserToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
