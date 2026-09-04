package com.smartbox.jobster.controller.open;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.dist.WhatsappEventDistributor;
import com.smartbox.jobster.service.whatsapp.WhatsappBotService;
import com.whatsapp.api.domain.webhook.WebHook;
import com.whatsapp.api.domain.webhook.WebHookEvent;
import io.jmix.core.security.Authenticated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;

@Controller
@RequestMapping("/open/whatsapp-handler")
public class WhatsappController {

    private static final Logger log = LoggerFactory.getLogger(WhatsappController.class);

    @Autowired
    private WhatsappBotService whatsappBotService;


    @PostMapping(produces = "application/json")
    public ResponseEntity<?> botHandler(@RequestBody String payload) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }



    // whatsapp verification endpoint for establishing webhook events
    @GetMapping
    @ResponseBody
    @Authenticated
    public int event(@RequestParam("hub.challenge") int challenge,
                        @RequestParam("hub.verify_token") String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}