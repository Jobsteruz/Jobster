package com.smartbox.jobster.entity.whatsapp;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.ref.Language;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_WHATSAPP_USER")
@Entity(name = "jb_WhatsappUser")
@Getter
@Setter
public class WhatsappUser extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -6010752930676833301L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOT_ID")
    protected WhatsappBot bot;

    @Column(name = "PHONE")
    protected String phone;

    @Column(name = "LOCATION")
    protected String location;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENT_MENU_ID")
    protected WhatsappMenu currentMenu;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENT_QUESTION_ID")
    protected Question currentQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LANGUAGE_ID")
    private Language language;

    @Column(name = "USER_STATE")
    private String userState;

    @Column(name = "BLOCKED")
    private Boolean blocked = Boolean.FALSE;


    public WAUserState getUserState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setUserState(WAUserState userState) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}