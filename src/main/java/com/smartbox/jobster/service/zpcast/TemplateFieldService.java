package com.smartbox.jobster.service.zpcast;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.zpcast.Template;
import com.smartbox.jobster.entity.zpcast.TemplateField;
import com.smartbox.jobster.service.GenCodeService;
import io.jmix.core.DataManager;
import io.jmix.multitenancy.core.TenantProvider;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TemplateFieldService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private TenantProvider tenantProvider;

    public TemplateField castToTemplateFieldNotSave(JSONObject jsonObject, TemplateField templateField) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public JSONArray convertTemplateFieldsToJson(Template template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Template copyTemplate(Template template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
