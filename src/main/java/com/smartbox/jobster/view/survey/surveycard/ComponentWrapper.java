package com.smartbox.jobster.view.survey.surveycard;

import com.vaadin.flow.component.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.function.Consumer;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComponentWrapper<T extends Component> {
    private T component;

    public boolean isPresent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void ifPresent(Consumer<Component> consumer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void removeComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean equals(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
