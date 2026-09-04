package com.smartbox.jobster.view.whatsapp.dtos;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

@JmixEntity
@Getter
@Setter
public class WhatsappPhoneNumberWebhookConfiguration {

    private String configuration;
}
