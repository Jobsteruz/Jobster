package com.smartbox.jobster.service.hh;

import com.github.scribejava.apis.HHApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.utils.StreamUtils;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.integration.hh.HHArea;
import com.smartbox.jobster.entity.integration.hh.HHProfession;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.service.UserService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.DataManager;
import io.jmix.core.TimeSource;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HHEmployerService {
    private static final Logger log = LoggerFactory.getLogger(HHEmployerService.class);

    @Autowired
    private LanguageService languageService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private UserService userService;

    public Boolean hasAccessHH(String employerId, IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getHHManagerId(IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void getHHArea(IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public HHArea createHHArea(String hhId, String name, HHArea parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isCreatedHHArea(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void getHHProfessionalRole(IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isCreatedHHProfession(Integer hhId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createHHLanguage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean userAuthorizationToHH(IntegratedUser integratedUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void writeResponseHH(Integer code, String text, IntegratedUser integratedUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void updateUserDetail(IntegratedUser integratedUser, OAuth2AccessToken accessToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isContainJson(JSONObject jsonObject, String key) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void openAuthorizationPopup(String script) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
