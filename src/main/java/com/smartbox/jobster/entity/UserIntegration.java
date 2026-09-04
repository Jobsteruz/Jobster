package com.smartbox.jobster.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import javax.annotation.Nullable;
import java.util.List;

public enum UserIntegration implements EnumClass<String> {
    HH("HH"),
    GOOGLE_SHEET("GOOGLE_SHEET"),
    GOOGLE_CALENDAR("GOOGLE_CALENDAR");

    private String id;

    UserIntegration(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static UserIntegration fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public interface HHConstants {
        String CLIENT_ID = "CHANGE_ME";
        String CLIENT_SECRET = "CHANGE_ME";
        String URL_HH_JOBSTER = "https://app.jobster.hr/hh-integration";

        // HH API requires a descriptive User-Agent (app name + contact email), otherwise requests are rejected (bad_user_agent / ddos-guard 403)
        String HH_USER_AGENT = "Jobster/4.0 (support@jobster.hr)";

        String URL_AUTH = "https://hh.ru/oauth/authorize?response_type=code&client_id=" + CLIENT_ID + "&redirect_uri=" + URL_HH_JOBSTER;

        //        ****************  Vacancy requests  ***********
        String HH_VACANCY_PUBLISH = "https://api.hh.ru/vacancies";
        String HH_VACANCY_UPDATE = "https://api.hh.ru/vacancies/{vacancy_id}";

        //        ****************  EMPLOYER  ***********
        String HH_ACCESS_EMPLOYER = "https://api.hh.ru/employers/employer_id/services/payable_api_actions/active";
        String HH_GET_ME = "https://api.hh.ru/me";
        String HH_GET_NEGOTIATION = "https://api.hh.ru/negotiations/{id}";
        String HH_GET_NEGOTIATION_TO_MESSAGES = "https://api.hh.ru/negotiations/{id}/messages";
        String HH_GET_UNREAD_MESSAGES = "https://api.hh.ru/negotiations/{id}/messages";

        String HH_AREA = "https://api.hh.ru/areas";
        String HH_PROFESSIONAL_ROLA = "https://api.hh.ru/professional_roles";
        String HH_LANGUAGES = "https://api.hh.ru/languages";

        //        ****************  Vacancy  ***********
        String HH_GET_VACANCIES = "https://api.hh.ru/employers/employer_id/vacancies/active";
        String HH_GET_VACANCY_URL = "https://api.hh.ru/vacancies/vacancy_id?host=hh.ru";
        String HH_DELETE_VACANCY = "https://api.hh.ru/employers/{employer_id}/vacancies/hidden/{vacancy_id}";
        String HH_ARCHIVE_VACANCY = "https://api.hh.ru/employers/{employer_id}/vacancies/archived/{vacancy_id}";
        String HH_ARCHIVED_LIST_VACANCY = "https://api.hh.ru/employers/{employer_id}/vacancies/archived";
        String HH_DELETED_LIST_VACANCY = "https://api.hh.ru/employers/{employer_id}/vacancies/hidden";
        String HH_GET_VACANCY_STATUS = "https://api.hh.ru/vacancies/{vacancyId}";
        String HH_GET_NEGOTIATION_VACANCY = "https://api.hh.ru/negotiations/response?vacancy_id={id}";
        String HH_GEN_RESUME_URL = "https://api.hh.ru/resumes/{resumeId}?topic_id={personId}&vacancy_id={vacancyId}";


        String URL_HH_WEBHOOK = "https://app.jobster.hr/webhook-response";
        String HH_SUBSCRIPTION = "https://api.hh.ru/webhook/subscriptions";
        String HH_SUBSCRIPTION_DELETE = "https://api.hh.ru/webhook/subscriptions/{id}";


        String HHOpenScript = "window.hhPopup = open('" + UserIntegration.HHConstants.URL_AUTH
                + "', 'HH', 'width=730,height=470,resizable,scrollbars');";
    }

    public interface GoogleSheetsConstants {

        String APP_URL = "https://app.jobster.hr";
        String CLIENT_ID = "CHANGE_ME";
        String CLIENT_SECRET = "CHANGE_ME";
        String REDIRECT_URIS = APP_URL + "/google/sheets";
        String URL_GET_SHEETS = "https://sheets.googleapis.com/v4/spreadsheets/{sheetId}/values/{range}";
        String URL_GET_ME = "https://www.googleapis.com/oauth2/v3/userinfo";
        String SCOPE = "https://www.googleapis.com/auth/userinfo.email " +
                "https://www.googleapis.com/auth/spreadsheets.readonly ";
        String AUTH_URI = "https://accounts.google.com/o/oauth2/auth?"
                + "client_id=" + CLIENT_ID + "&access_type=offline&&response_type=code&scope=" + SCOPE
                + "&redirect_uri=" + REDIRECT_URIS;

        String GoogleOpenScript = "window.googlePopup=open('" + UserIntegration.GoogleSheetsConstants.AUTH_URI +
                "','Google Sheets API','width=640,height=720,resizable,scrollbars')";
    }

    public interface GoogleCalendarConstants {
        String APP_URL = "https://app.jobster.hr";
        String CLIENT_ID = "CHANGE_ME";
        String CLIENT_SECRET = "CHANGE_ME";
        String REDIRECT_URI = APP_URL + "/google/calendar";
        String URL_GET_ME = "https://www.googleapis.com/oauth2/v3/userinfo";
        String SCOPE = "https://www.googleapis.com/auth/calendar " +
                "https://www.googleapis.com/auth/userinfo.email";
        String AUTH_URI = "https://accounts.google.com/o/oauth2/auth?"
                + "client_id=" + CLIENT_ID
                + "&access_type=offline"
                + "&prompt=consent"
                + "&response_type=code"
                + "&scope=" + SCOPE
                + "&redirect_uri=" + REDIRECT_URI;
        String WEBHOOK_URL = APP_URL + "/google/calendar/webhook";

        String GoogleCalendarOpenScript = "window.googleCalendarPopup=open('" + AUTH_URI +
                "','Google Calendar API','width=640,height=720,resizable,scrollbars')";
    }

    /**
     * Microsoft Graph (Outlook mail) integration constants, mirroring {@link GoogleCalendarConstants}.
     * <p>
     * For local testing, point {@code APP_URL} at your ngrok domain (it flows into REDIRECT_URI,
     * WEBHOOK_URL and AUTH_URI) and register that redirect URI on the Azure app; switch APP_URL back
     * to production afterwards. REDIRECT_URI must match one of the Azure app's redirect URIs exactly.
     */
    public interface MicrosoftGraphConstants {
        String APP_URL = "https://app.jobster.hr";
        String CLIENT_ID = "CHANGE_ME";
        // Azure client secret VALUE (Certificates & secrets). Replace/rotate if this is stale.
        String CLIENT_SECRET = "CHANGE_ME";
        String REDIRECT_URI = APP_URL + "/outlook/callback";
        String WEBHOOK_URL = APP_URL + "/webhook-response/outlook";

        // Delegated Microsoft Graph scopes:
        //  offline_access -> refresh token (survives the recruiter being offline)
        //  Mail.Read      -> read messages + attachments
        //  User.Read      -> resolve the connecting mailbox address (/me)
        String SCOPE = "openid offline_access User.Read Mail.Read";

        // Authorization endpoint (v2.0, common authority = work/school + personal accounts).
        // prompt=consent guarantees a refresh token; response_mode=query keeps ?code=... for the callback.
        String AUTHORIZE_BASE = "https://login.microsoftonline.com/common/oauth2/v2.0/authorize";
        String AUTH_URI = AUTHORIZE_BASE
                + "?client_id=" + CLIENT_ID
                + "&response_type=code"
                + "&redirect_uri=" + REDIRECT_URI
                + "&response_mode=query"
                + "&prompt=consent"
                + "&scope=" + SCOPE;

        // Microsoft Graph REST (v1.0). The token exchange itself is done by ScribeJava's
        // MicrosoftAzureActiveDirectory20Api (common authority).
        String GRAPH_BASE = "https://graph.microsoft.com/v1.0";
        String GRAPH_ME = GRAPH_BASE + "/me?$select=mail,userPrincipalName,displayName";
        String GRAPH_SUBSCRIPTIONS = GRAPH_BASE + "/subscriptions";

        // Change-notification subscription target: new mail in the recruiter's Inbox.
        String INBOX_MESSAGES_RESOURCE = "/me/mailFolders('inbox')/messages";

        String MsGraphOpenScript = "window.outlookPopup=open('" + AUTH_URI +
                "','Outlook','width=640,height=720,resizable,scrollbars')";
    }

    public interface IshGO {
        String ISHGO_CLIENT_USERNAME = "ishGO";
        String ISHGO_CLIENT_PASSWORD = "CHANGE_ME";
        String REFRESH_TOKEN_URL = "CHANGE_ME";
        String REFRESH_TOKEN_URL_PRE_PROD = "CHANGE_ME";
        String ISHGO_BASE_URL = "https://api.ishgo.uz/api/rest";
        String ISHGO_PRE_PROD_URL = "https://<partner-preprod-host>/api/rest";
    }

    public interface FaceDetection {
        String BASE_URL = "https://<face-service-host>";
        String CLIENT_ID = "facedetection";
        String CLIENT_SECRET = "CHANGE_ME";
    }

    public interface AISearch {
        String BASE_URL = "https://<ai-search-host>/api";
//        String BASE_URL = "http://localhost:8000/api";
        String SEARCH_URL = BASE_URL + "/collections/search";
        String PROMPT_SEARCH_URL = "[не публикуется]";
        String CLIENT_ID = "searcher";
        String CLIENT_SECRET = "CHANGE_ME";
    }

    public interface GroqAIConfig {
        String BASE_URL = "https://api.groq.com/openai/v1";
        String API_KEY = "CHANGE_ME";
    }

    public interface ElevenLabs {
        String BASE_URL = "https://api.elevenlabs.io/v1/speech-to-text";
        String API_KEY = "CHANGE_ME";
        String MODEL = "scribe_v1";
        Integer CONNECTION_TIME_OUT = 5000;
        Integer READ_TIME_OUT = 15000;

        Integer MAX_RETRIES = 3;
        String DEFAULT_LANGUAGE = "ru";
        Integer MAX_FILE_SIZE_MB = 5;
        List<String> SUPPORTED_FORMATS = List.of("wav", "mp3", "ogg", "webm");
    }

    public interface Superset {
        String BASE_URL = "https://<bi-host>";
    }
}
