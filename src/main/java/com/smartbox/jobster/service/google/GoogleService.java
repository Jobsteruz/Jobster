package com.smartbox.jobster.service.google;


import com.github.scribejava.apis.GoogleApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.common.base.Strings;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.integration.IntegratedGoogle;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.entity.mapping.EntityMappingProperty;
import com.smartbox.jobster.view.mapping.EntityMappingTask;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.view.View;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;


@Service
public class GoogleService {
    private static final Logger log = LoggerFactory.getLogger(GoogleService.class);

    @Autowired
    private DataManager dataManager;
    @Autowired
    private Messages messages;
    @Autowired
    private Dialogs dialogs;

    public void googleSheets(IntegratedUser integratedUser, View<?> origin) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean authorizeGoogleSheets(IntegratedUser integratedUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createMappingTask(EntityMapping mapping, List<?> data, View<?> origin,
                                  String header, String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public IntegratedGoogle getOrCreateIntegratedGoogleByUser(IntegratedUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Object> getDataFromSheets(IntegratedGoogle integratedGoogle) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Map<String, String>> settingMap(EntityMapping mapping, List<Object> values) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, Integer> getHeaders(List<EntityMappingProperty> properties, Object headers) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Object getValue(List<?> list, Integer index) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String urlEncodeSheetName(String range) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String[] separateSheetNameAndRange(String range) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}