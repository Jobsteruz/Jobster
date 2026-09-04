package com.smartbox.jobster.component;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.questionnaire.QuestionWebType;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.dnd.DragSource;
import com.vaadin.flow.component.html.Div;
import io.jmix.core.Messages;
import lombok.Getter;

public class CardComponent extends Div implements HasStyle {
    @Getter
    private QuestionWebType questionWebType;

    public CardComponent(QuestionWebType questionWebType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
