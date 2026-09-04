package com.smartbox.jobster.entity.whatsapp;

import com.smartbox.jobster.entity.AbstractPost;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_WHATSAPP_POST")
@Entity(name = "jb_WhatsappPost")
@Getter
@Setter
public class WhatsappPost extends AbstractPost implements Serializable {

    private static final long serialVersionUID = -6136102130126809300L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MENU_ID")
    private WhatsappMenu menu;
}