package com.smartbox.jobster.controller.outlook;

import com.smartbox.jobster.service.outlook.OutlookSubscriptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Receives Microsoft Graph change notifications for Outlook mailboxes.
 * <p>
 * Lives under {@code /webhook-response/**}, which is already anonymous (the CV-parser webhook uses
 * the same prefix) — Graph calls us server-to-server with no session. Two request shapes:
 * <ul>
 *   <li><b>Validation</b> (sent once when a subscription is created): a {@code validationToken} query
 *       param that must be echoed back as {@code text/plain} within 10s, or Graph rejects the
 *       subscription.</li>
 *   <li><b>Notification</b>: a JSON body; authenticity is checked via {@code clientState} inside
 *       {@link OutlookSubscriptionService#handleNotificationPayload}.</li>
 * </ul>
 * Always returns 2xx quickly so Graph does not retry / drop the subscription.
 */
@RestController
public class OutlookWebhookController {

    private static final Logger log = LoggerFactory.getLogger(OutlookWebhookController.class);

    private final OutlookSubscriptionService outlookSubscriptionService;

    public OutlookWebhookController(OutlookSubscriptionService outlookSubscriptionService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RequestMapping(path = "/webhook-response/outlook", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<String> notifications(
            @RequestParam(name = "validationToken", required = false) String validationToken,
            @RequestBody(required = false) String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
