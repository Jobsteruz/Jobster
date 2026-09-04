package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import io.jmix.core.FileRef;

@Tag("video")
public class VideoPlayer extends Component implements HasSize {
    public VideoPlayer(String src) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VideoPlayer(FileRef src) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void serSource(String src) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    {
        getElement().setAttribute("controls", true);
    }

}
