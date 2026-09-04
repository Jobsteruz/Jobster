package com.smartbox.jobster.component;

import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import lombok.Getter;

@Tag("color-circle")
@Getter
public class ColorCircleComponent extends Div {
    private final Icon icon;
    private final QuestionnaireColor color;

    public ColorCircleComponent(QuestionnaireColor color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
