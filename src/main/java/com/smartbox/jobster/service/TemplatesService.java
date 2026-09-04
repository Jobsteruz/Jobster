package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.pojo.Template;
import io.jmix.core.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplatesService {

    @Autowired
    private Resources resources;

    public Template getTemplate(String templateName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}