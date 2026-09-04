package com.smartbox.jobster.entity.tg;

import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.FileRef;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TG_BOT")
@Entity(name = "jb_TgBot")
@Getter
@Setter
public class Bot extends StandardTenantEntity implements HasName.HasShortName, Serializable {

    private static final long serialVersionUID = 3077151186018777514L;

    @InstanceName
    @Column(name = "SHORT_NAME")
    private String shortName;

    @Secret
    @Column(name = "TOKEN", length = 1024)
    private String token;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "AUTO_LOGOUT")
    private Integer autoLogout;

    @Column(name = "START_TEXT")
    @Lob
    private String startText;

    @Column(name = "START_IMAGE", length = 1024)
    private FileRef startImage;

    public AutoLogout getAutoLogout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAutoLogout(AutoLogout autoLogout) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}