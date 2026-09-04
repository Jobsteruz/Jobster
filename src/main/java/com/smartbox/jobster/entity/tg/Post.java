package com.smartbox.jobster.entity.tg;

import com.smartbox.jobster.entity.AbstractPost;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

// Tg Post
@JmixEntity
@Table(name = "JB_POST")
@Entity(name = "jb_Post")
@Getter
@Setter
public class Post extends AbstractPost implements Serializable {

    public static final String BODY = "body";
    private static final long serialVersionUID = 2070459713347040427L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MENU_ID")
    private Menu menu;

    @Column(name = "INLINE_KEYBOARD")
    private Boolean inlineKeyboard = Boolean.FALSE;

    @Column(name = "DISABLE_WEB_PAGE_PREVIEW")
    private Boolean disableWebPagePreview;
}