package com.smartbox.jobster.entity.tg;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.ref.Language;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_TG_USER", indexes = {
        @Index(name = "IDX_JB_TG_USER_BOT", columnList = "BOT_ID"),
        @Index(name = "IDX_JB_TG_USER_LANGUAGE", columnList = "LANGUAGE_ID"),
        @Index(name = "IDX_JB_TG_USER_CURRENT_MENU", columnList = "CURRENT_MENU_ID"),
        @Index(name = "IDX_JB_TG_USER_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_TG_USER_CURRENT_QUESTION", columnList = "CURRENT_QUESTION_ID"),
        @Index(name = "IDX_JB_TG_USER_CHAT_BOT", columnList = "CHAT_ID, BOT_ID")
})
@Entity(name = "jb_TgUser")
@Getter
@Setter
public class TgUser extends SmartTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -4790304132831969366L;

    @InstanceName
    @Column(name = "CHAT_ID")
    private Long chatId;

    @JoinColumn(name = "BOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bot bot;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "LOCATION")
    private String location;

    @JoinColumn(name = "LANGUAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language language;

    @Column(name = "USER_STATE")
    private String userState;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "CURRENT_MENU_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Menu currentMenu;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Column(name = "LOGIN_TYPE")
    private String loginType;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "CURRENT_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question currentQuestion;

    @Column(name = "BLOCKED")
    private Boolean blocked;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @Column(name = "LOGIN_DATE")
    protected OffsetDateTime loginDate;

    public LoginType getLoginType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLoginType(LoginType loginType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgUserState getUserState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setUserState(TgUserState userState) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}