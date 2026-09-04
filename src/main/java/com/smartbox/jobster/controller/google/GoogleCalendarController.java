package com.smartbox.jobster.controller.google;

import com.smartbox.jobster.$;
import com.smartbox.jobster.controller.hh.WebsiteConstants;
import com.smartbox.jobster.service.google.GoogleCalendarService;
import io.jmix.core.security.Authenticated;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class GoogleCalendarController {
    private static final Logger log = LoggerFactory.getLogger(GoogleCalendarController.class);

    @Autowired
    private GoogleCalendarService googleCalendarService;

    @Authenticated
    @ResponseBody
    @RequestMapping(path = "/google/calendar", method = {RequestMethod.GET, RequestMethod.POST})
    public Object googleCalendarCallback(HttpServletRequest request, HttpServletResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @ResponseBody
    @RequestMapping(path = "/google/calendar/webhook", method = RequestMethod.POST)
    public ResponseEntity<Void> webhook(HttpServletRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
