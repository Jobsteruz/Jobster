package com.smartbox.jobster.service.superset;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.UserService;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SupersetTokenService {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private UserService userService;

    @Value("${spring.jsuperset.host}")
    private String host;
    @Value("${spring.jsuperset.login}")
    private String login;
    @Value("${spring.jsuperset.password}")
    private String password;

    public String getGuestTokenForDashboard(String dashboardUuid, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getAdminAccessToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getCsrfToken(String accessToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String createGuestToken(String accessToken, String csrfToken, String dashboardUuid, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
