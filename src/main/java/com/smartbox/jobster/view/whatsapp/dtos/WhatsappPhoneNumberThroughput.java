package com.smartbox.jobster.view.whatsapp.dtos;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

@JmixEntity(name = "jb_WhatsappPhoneNumberThroughput")
@Getter
@Setter
public class WhatsappPhoneNumberThroughput {

    private String level;
}
