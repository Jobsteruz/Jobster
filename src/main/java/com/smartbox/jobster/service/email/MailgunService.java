package com.smartbox.jobster.service.email;

import com.smartbox.jobster.entity.config.MailgunSettings;
import com.smartbox.jobster.pojo.MailPojo;
import io.jmix.appsettings.AppSettings;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailgunService implements EmailService {
    private static final Logger log = LoggerFactory.getLogger(MailgunService.class);
    private final AppSettings appSettings;

    @Override
    public boolean sendEmail(MailPojo message, String to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
