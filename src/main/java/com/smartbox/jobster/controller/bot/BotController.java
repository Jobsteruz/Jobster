package com.smartbox.jobster.controller.bot;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.utility.BotUtils;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.tg.BotService;
import io.jmix.core.security.Authenticated;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * Since: 28/11/2023 10:42 PM
 */
@Controller
public class BotController {
    private static final Logger log = LoggerFactory.getLogger(BotController.class);

    @Autowired
    private BotService botService;

    /**
     * Sample url : <a href="https://bot3.smartbox.uz/bot-handler/{botId}">...</a>
     */
    @Authenticated
    @ResponseBody
    @RequestMapping(path = "/bot-handler/{botId}", method = {RequestMethod.GET, RequestMethod.POST})
    public Object botHandler(HttpServletRequest request,
                             HttpServletResponse response,
                             @PathVariable String botId) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
