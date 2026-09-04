package com.smartbox.jobster.security;

import io.jmix.security.role.annotation.ResourceRole;

/**
 * Deny-marker role: a user holding this role must NOT be able to use the mobile application.
 * <p>
 * Jmix resource roles are additive (they can only grant), so the restriction itself is enforced
 * outside the role model, in two places keyed on this role's {@link #CODE}:
 * <ul>
 *   <li>{@code MobileLoginRestrictionListener} — rejects the OAuth2 {@code password} grant at
 *       {@code /oauth2/token}, so the user cannot log in to the mobile app with login/password;</li>
 *   <li>{@code UserBoundTokenAuthorizationManager} — denies bearer-token requests to
 *       {@code /api/**} and {@code /rest/**}, so tokens issued <em>before</em> the role was
 *       assigned (access or refreshed ones) stop working immediately.</li>
 * </ul>
 * The role carries no policies on purpose — assigning it changes nothing for the web UI.
 */
@ResourceRole(name = "Mobile: login denied", code = MobileLoginRestrictionRole.CODE)
public interface MobileLoginRestrictionRole {

    String CODE = "mobile-login-denied";
}
