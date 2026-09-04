package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import io.jmix.core.FileRef;

@Tag("audio")
public class AudioPlayer extends Component {

    public AudioPlayer(String src) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AudioPlayer(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    {
        getElement().setAttribute("controls", true);
    }

    public void setSource(String src) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
