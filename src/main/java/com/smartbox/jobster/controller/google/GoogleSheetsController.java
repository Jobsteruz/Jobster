package com.smartbox.jobster.controller.google;

import com.smartbox.jobster.$;
import com.smartbox.jobster.controller.hh.WebsiteConstants;
import com.smartbox.jobster.service.UserService;
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

import java.util.UUID;

@Controller("")
public class GoogleSheetsController {
    private static final Logger log = LoggerFactory.getLogger(GoogleSheetsController.class);

    @Autowired
    private UserService userService;

    //    @Authenticated
    @ResponseBody
    @RequestMapping(path = "/google/sheets", method = {RequestMethod.GET, RequestMethod.POST})
    public Object googleSheets(HttpServletRequest request, HttpServletResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
