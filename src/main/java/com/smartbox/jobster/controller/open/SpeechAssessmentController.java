package com.smartbox.jobster.controller.open;

import com.google.gson.Gson;
import com.smartbox.jobster.pojo.ai.response.SpeechAssessmentResponse;
import com.smartbox.jobster.service.SpeechAssessmentService;
import io.jmix.core.security.Authenticated;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.UUID;
import java.util.stream.Collectors;


/**
 * @author Jobster team
 * date: 14/06/24 22:01
 */
@Controller
@RequestMapping(path = SpeechAssessmentController.API_ENDPOINT)
public class SpeechAssessmentController {

    private static final Logger log = LoggerFactory.getLogger(SpeechAssessmentController.class);
    public static final String API_ENDPOINT = "/open/speech-assessment-callback";

    @Autowired
    private SpeechAssessmentService speechAssessmentService;

    @Authenticated
    @PostMapping("/{aiServiceLogId}")
    public ResponseEntity<?> handleAssessmentResponse(HttpServletRequest request, @PathVariable String aiServiceLogId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
