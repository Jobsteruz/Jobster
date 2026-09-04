/*
 * Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.core.session;

import com.smartbox.jobster.$;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.core.log.LogMessage;
import org.springframework.util.Assert;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Default implementation of
 * {@link org.springframework.security.core.session.SessionRegistry SessionRegistry} which
 * listens for {@link org.springframework.security.core.session.SessionDestroyedEvent
 * SessionDestroyedEvent}s published in the Spring application context.
 * <p>
 * For this class to function correctly in a web application, it is important that you
 * register an <a href="
 * {@docRoot}/org/springframework/security/web/session/HttpSessionEventPublisher.html">HttpSessionEventPublisher</a> in
 * the <tt>web.xml</tt> file so that this class is notified of sessions that expire.
 *
 * @author Ben Alex
 * @author Luke Taylor
 */
public class SessionRegistryImpl implements SessionRegistry, ApplicationListener<AbstractSessionEvent> {

    protected final Log logger = LogFactory.getLog(SessionRegistryImpl.class);

    // <principal:Object,SessionIdSet>
    private final ConcurrentMap<Object, Set<String>> principals;

    // <sessionId:Object,SessionInformation>
    private final Map<String, SessionInformation> sessionIds;

    // <sessionId:Object,SessionIp>
    private final Map<String, String> sessionIps;

    public SessionRegistryImpl() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SessionRegistryImpl(ConcurrentMap<Object, Set<String>> principals,
                               Map<String, SessionInformation> sessionIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SessionRegistryImpl(ConcurrentMap<Object, Set<String>> principals,
                               Map<String, SessionInformation> sessionIds,
                               Map<String, String> sessionIps) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<Object> getAllPrincipals() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<SessionInformation> getAllSessions(Object principal, boolean includeExpiredSessions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public SessionInformation getSessionInformation(String sessionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getSessionIp(String sessionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onApplicationEvent(AbstractSessionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void refreshLastRequest(String sessionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void registerNewSession(String sessionId, Object principal) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void removeSessionInformation(String sessionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
