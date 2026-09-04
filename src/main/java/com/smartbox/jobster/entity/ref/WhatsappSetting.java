package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_WHATSAPP_SETTING")
@Entity(name = "jb_WhatsappSetting")
@Getter
@Setter
public class WhatsappSetting extends AbstractSetting implements Serializable {

    private static final long serialVersionUID = 8023237083110877221L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "BOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private WhatsappBot bot;
}