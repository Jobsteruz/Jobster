package com.smartbox.jobster.controller.bot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.pebble.BotVacancyExtension;
import com.smartbox.jobster.pojo.SimpleHierarchicOption;
import com.smartbox.jobster.pojo.Template;
import com.smartbox.jobster.service.*;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.security.Authenticated;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

/**
 * @author Jobster team
 * Since: 9/6/2024 2:36 PM
 */
@Controller
@RequestMapping(path = BotVacancyController.API_ENDPOINT)
public class BotVacancyController {
    private static final Logger log = LoggerFactory.getLogger(BotVacancyController.class);

    public static final String API_ENDPOINT = "/bot-vacancy";
    private static final Gson GSON = new GsonBuilder().create();

    @Autowired
    private TemplatesService templatesService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private HierarchyService hierarchyService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @Value("${app.url}")
    private String appUrl;

    @Authenticated
    @ResponseBody
    @GetMapping(path = "/{tgUserId}")
    public Object vacancyBotApp(HttpServletRequest request, HttpServletResponse response, @PathVariable String tgUserId,
                                @RequestParam(required = false) String regionId,
                                @RequestParam(required = false) String branchId,
                                @RequestParam(required = false) String positionId,
                                Locale locale) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
