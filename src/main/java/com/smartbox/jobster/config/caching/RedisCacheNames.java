package com.smartbox.jobster.config.caching;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Jobster team
 * date: 04/07/24 16:49
 */
public interface RedisCacheNames {
    String PROTECTED_ROBOT_CACHE = "protected-robot-cache";
    String PROTECTED_ROBOT_LOCK_CACHE = "protected-robot-lock-cache";
    String ROBOT_NOMATCH_CACHE = "robot-nomatch-cache";
    String ROBOT_ENQUEUE_MARKS = "robot-enqueue-marks";

    String REPORTS_CACHE = "reports-cache";

    String MANUAL_ATTENDANCE_CACHE = "manual-attendance-cache";
    String TG_MESSAGE_ID_CACHE = "tg-message-id-cache";
    String FULL_NAME_FORMAT = "full-name-format";
    String FULL_NAME = "full-name";
    String TENANT_STATUS = "tenant-status";

    String VERIFICATION = "verification";
    String SMS_GATEWAY = "sms-gateway";
    String TRANSLATIONS = "translations";
    String NAVIGATIONS = "navigations";

    String BOTS = "bots";
    String BOT_STATUS = "bot-status";

    String AI_SERVICE_LOG = "ai-service-log";
    String AI_SERVICE_LOG_EXISTS_BY_ENTITY = "ai-service-log-exists-by-entity";

    String NETWORK_SETTINGS_CACHE = "network-settings-cache";
    String TRUSTED_DEVICE_MAX_AGE = "trusted-device-max-age";

    String ROOTED_DEPARTMENT_LABEL = "rooted-department-label";
    String BRANCH_DEPARTMENT_LABEL = "branch-department-label";
    String TEMPLATE_2_STEP = "template-2-step";
    String OFFER_POSITION_ON_REJECT = "offer-position-on-reject";
    String SELECT_VACANCY_ON_MESSAGE = "select-vacancy-on-message";
    String AUTO_CREATE_VACANCY_ON_APPROVE = "auto-create-vacancy-on-approve";
    String TWO_STEP_REQUEST_APPROVAL = "two-step-request-approval";
    String ADDITIONAL_QUESTIONS_J3 = "additional-questions-j3";
    String COMPANY_UNPAID_MONTHS = "company-unpaid-months";

    String ISHGO = "ishgo";
    String AI_SUMMARIZER = "ai_summarizer";
    String AI_MATCH_SCORE = "ai-match-score";

    String VIEW_SETTINGS_CACHE = "viewSettings";

    String SESSION_PRINCIPALS = "session-principals";
    String SESSION_IDS = "session-ids";
    String SESSION_IPS = "session-ips";
    String SESSION_AUTH = "session-auth";
    String SESSION_USER_TOKEN = "session-user-token";
    String SAML_AUTH_REQUEST = "saml-auth-request";

    String CV_PARSE_JOBS = "cv-parse-jobs";
    String CV_PARSE_BATCHES = "cv-parse-batches";
    String CV_PARSER_LANGUAGES = "cv-parser-languages";
    String CV_PARSER_EDUCATION_LEVELS = "cv-parser-education-levels";
    String CV_PARSER_EXPERIENCE_LEVELS = "cv-parser-experience-levels";

    // key - cache manager
    // value - set of cache names
    Map<String, Collection<String>> PROTECTED_CACHES = Map.of(
            "cacheManager", Set.of(PROTECTED_ROBOT_CACHE)
    );

    Collection<String> AVAILABLE_CACHES = List.of(
            TRANSLATIONS,
            NAVIGATIONS
    );
}