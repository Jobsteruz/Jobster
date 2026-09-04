package com.smartbox.jobster.view.comment;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.cms.Comment;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "comment-view", layout = MainView.class)
@ViewController(id = "jb_CommentView")
@ViewDescriptor(path = "comment-view.xml")
@DialogMode(width = "30em", height = "AUTO")
public class CommentView extends StandardView {
    @Setter
    private UUID entityId;
    @Setter
    private String entityName;
    @Getter
    private Comment entity;

    @Autowired
    private Messages messages;

    @Autowired
    private DataManager dataManager;

    @Autowired
    private UserService userService;

    @ViewComponent
    private RichTextEditor comment;

    public void setEntity(Comment entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "save", subject = "clickListener")
    public void onSaveClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancel", subject = "clickListener")
    public void onCancelClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}