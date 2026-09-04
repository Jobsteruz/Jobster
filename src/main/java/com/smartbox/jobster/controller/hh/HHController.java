package com.smartbox.jobster.controller.hh;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.integration.hh.HHStage;
import com.smartbox.jobster.entity.integration.hh.HHWebhookType;
import com.smartbox.jobster.service.TemplatesService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHApplicantService;
import io.jmix.core.security.Authenticated;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;


@Controller
public class HHController {

    private static final Logger log = LoggerFactory.getLogger(HHController.class);
    @Autowired
    private TemplatesService templatesService;
    @Autowired
    private UserService userService;
    @Autowired
    private HHApplicantService hHApplicantService;


    @RequestMapping(path = "/hh-integration", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object hhIntegration(HttpServletRequest request, HttpServletResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RequestMapping(path = "/webhook-response", method = {RequestMethod.POST})
    @ResponseBody
    @Authenticated
    public Object webhookResponse(@RequestBody String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

