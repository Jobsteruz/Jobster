package com.smartbox.jobster.controller.bot;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.pebble.BotAttendanceExtension;
import com.smartbox.jobster.pojo.Template;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TemplatesService;
import com.smartbox.jobster.service.attendance.AttendanceOneDayDTO;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.service.attendance.MonthlyAttendanceDTO;
import io.jmix.core.security.Authenticated;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

/**
 * Author: Clean
 * Since: 13/03/2025 5:21 PM
 */
@Controller
@RequestMapping(path = BotAttendanceController.API_ENDPOINT)
@RequiredArgsConstructor
public class BotAttendanceController {
    private static final Logger log = LoggerFactory.getLogger(BotAttendanceController.class);
    public static final String API_ENDPOINT = "/bot-attendance";

    private final TemplatesService templatesService;
    private final EntityService entityService;
    private final AttendanceService attendanceService;


    @Authenticated
    @ResponseBody
    @GetMapping(path = "/{tgUserId}")
    public Object attendanceBotApp(HttpServletRequest request, HttpServletResponse response, @PathVariable String tgUserId, Locale locale) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
