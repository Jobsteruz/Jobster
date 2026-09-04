package com.smartbox.jobster.controller.outlook;

import com.smartbox.jobster.$;
import com.smartbox.jobster.controller.hh.WebsiteConstants;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.service.outlook.OutlookOAuthService;
import com.smartbox.jobster.service.outlook.OutlookSubscriptionService;
import io.jmix.core.security.Authenticated;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * OAuth2 redirect handler for the Outlook mailbox connect flow, mirroring
 * {@link com.smartbox.jobster.controller.google.GoogleCalendarController}. Microsoft redirects the
 * consent popup here with {@code ?code=...}; the connecting user id was stashed in the HTTP session
 * by the profile view before the popup opened. The request rides the recruiter's authenticated
 * same-origin session, so no anonymous permit is needed (same as the Google callback).
 */
@Controller
public class OutlookController {

    private static final Logger log = LoggerFactory.getLogger(OutlookController.class);

    @Autowired
    private OutlookOAuthService outlookOAuthService;
    @Autowired
    private OutlookSubscriptionService outlookSubscriptionService;

    @Authenticated
    @ResponseBody
    @RequestMapping(path = "/outlook/callback", method = {RequestMethod.GET, RequestMethod.POST})
    public Object outlookCallback(HttpServletRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
