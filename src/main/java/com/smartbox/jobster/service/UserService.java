package com.smartbox.jobster.service;

import com.github.scribejava.apis.GoogleApi20;
import com.github.scribejava.apis.HHApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.utils.StreamUtils;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyStatus;
import com.smartbox.jobster.entity.company.TemporaryCompany;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.security.CompanyAdminRole;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.core.security.Authenticated;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.multitenancy.core.TenantProvider;
import io.jmix.security.role.assignment.RoleAssignmentRoleType;
import io.jmix.securitydata.entity.RoleAssignmentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/29/2023 4:30 PM
 */
@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private EntityService entityService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private UnconstrainedDataManager unconstrainedDataManager;

    @PersistenceContext
    private EntityManager entityManager;


    public boolean isAdmin() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public User currentUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The authenticated user's id, read from the session/token instead of the database.
     * <p>
     * Prefer this over {@code currentUser().getId()}. {@link #currentUser()} re-reads jb_User
     * through the SECURED {@link DataManager}, so a role set without read access to jb_User makes it
     * return null and every chained getter an NPE — the caller is punished for a permission it does
     * not need, because the id is already in the authentication. Seen in production 2026-08-19 on
     * {@code api_requestService/getAll}: a mobile user whose roles deny jb_User read (AccessLogger:
     * "Denied access to [entity 'jb_User' ...] by CrudEntityConstraint") got a 500 on every call.
     */
    public UUID currentUserId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public User admin() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public UUID getIdByUsername(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public User getUserByUsername(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public IntegratedUser getIntegratedUserByPlatform(User user, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<IntegratedUser> getIntegratedUsersByEmployerId(String employerId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public IntegratedUser getCurrentIntegratedUserByPlatform(Platform platform, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public IntegratedUser getCurrentIntegratedUserByPlatformAndInn(Platform platform, String inn, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<IntegratedUser> getIntegratedUsersByPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<IntegratedUser> getIntegratedUsersByPlatform(Platform platform, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<IntegratedUser> getIntegratedUsers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean hasHHSubscription(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isUserIntegratedWithPlatform(User user, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Boolean matchUserPassword(String username, String password) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public String getUserTenantId(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public String getUserLocale(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Persist the user's preferred locale to {@code jb_User.locale}.
     * <p>
     * Called from the login flow when the locale chosen on the login page differs from
     * (or is missing in) the stored value. Runs under system authentication because
     * the principal is not yet established at the call site.
     *
     * @param username target user
     * @param localeId language tag (e.g. {@code "en"}, {@code "ru"}, {@code "uz"}); ignored when blank
     */
    @Authenticated
    public void saveUserLocale(String username, String localeId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public User createUserFromEmployee(Employee employee, SaveContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean usernameExists(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * creates a new system user
     */
    @Authenticated
    public void createMinimalUser(TemporaryCompany tempCompany) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createIntegratedUser(String code, UUID userId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createIntegratedUserWithGoogleSheet(String code, UUID userId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
