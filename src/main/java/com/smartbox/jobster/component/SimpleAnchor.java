package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.vaadin.flow.component.html.Anchor;
import io.jmix.core.FileRef;

public class SimpleAnchor extends Anchor {


    public SimpleAnchor(String href,String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SimpleAnchor(FileRef fileRef){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    {
        this.setTarget("_blank");
        this.getStyle().setTextDecoration("underline");
    }
}
