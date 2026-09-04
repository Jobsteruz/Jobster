package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.service.security.PasswordPolicyService;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Keeps the password-policy bookkeeping in sync with every way a {@link User}'s password can change
 * — the self-service dialog, the token-based {@code SetPasswordView}, and admin resets all end up
 * persisting {@code jb_User.password}, and all of them land here.
 *
 * <p>Runs after commit (plain {@code @EventListener}, like the other listeners in this package) so
 * the new hash is already stored. The save performed by {@link PasswordPolicyService#onPasswordPersisted}
 * only touches the change-date/flag, so the resulting follow-up event is ignored and there is no loop.
 */
@Component
@RequiredArgsConstructor
public class UserPasswordEventListener {

    private final PasswordPolicyService passwordPolicyService;

    @EventListener
    void onUserChangedAfterCommit(EntityChangedEvent<User> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
