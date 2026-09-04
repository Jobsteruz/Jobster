package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.pojo.MailPojo;
import com.smartbox.jobster.service.PartnerIntegrationService;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.person.ApplicantService;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Component("jb_ApplicantEventListener")
@RequiredArgsConstructor
public class ApplicantEventListener {
    private final ApplicantService applicantService;
    private final MQService mqService;
    private final PartnerIntegrationService partnerintegrationService;
    private static final Logger log = LoggerFactory.getLogger(ApplicantEventListener.class);

    @EventListener
    public void onApplicantChangedBeforeCommit(final EntityChangedEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}