package com.smartbox.jobster.view.video;

import com.smartbox.jobster.component.VideoPlayer;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.view.chat.bigvideo.BigVideoView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "video-info-view", layout = MainView.class)
@ViewController("jb_VideoInfoView")
@ViewDescriptor("video-info-view.xml")
public class VideoInfoView extends StandardView {

    @Autowired
    private DialogWindows dialogWindows;

    @ViewComponent
    private HorizontalLayout videoContainer;

    @Setter
    private QuestionAnswer questionAnswer;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "videoMoreBtn", subject = "clickListener")
    public void onVideoMoreBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void initProps(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
