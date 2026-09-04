package com.smartbox.jobster.controller.open;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Offer;
import com.smartbox.jobster.entity.hrm.OfferUser;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.pojo.Template;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.OfferService;
import com.smartbox.jobster.service.TemplatesService;
import com.smartbox.jobster.service.VerificationService;
import io.jmix.core.FileRef;
import io.jmix.core.TimeSource;
import io.jmix.core.security.Authenticated;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.extension.i18n.I18nExtension;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(path = OfferPersonController.API_ENDPOINT)
public class OfferPersonController {
    private static final Logger log = LoggerFactory.getLogger(OfferPersonController.class);
    public static final String API_ENDPOINT = "/open/offer";

    @Autowired
    private EntityService entityService;
    @Autowired
    private TemplatesService templatesService;
    @Autowired
    private VerificationService verificationService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private OfferService offerService;

    @Authenticated
    @ResponseBody
    @GetMapping("/{offerId}")
    public Object preview(@PathVariable UUID offerId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @ResponseBody
    @PostMapping("/{offerId}/code")
    public Object code(@PathVariable UUID offerId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @ResponseBody
    @PostMapping("/{offerId}/status")
    public Object status(@PathVariable UUID offerId, @RequestBody String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String verificationCodeKey(UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
