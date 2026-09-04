package com.smartbox.jobster.service.restservices.translate;

import com.smartbox.jobster.$;
import io.jmix.core.DataManager;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.postgresql.util.PGobject;

import java.util.*;

@RestService("api_translateService")
@RequiredArgsConstructor
public class RestTranslateService {
    private final DataManager dataManager;


    @RestMethod
    public List<TranslateEntityDTO> translateEntities(EntitiesWithLocaleDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
