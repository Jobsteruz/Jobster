package com.smartbox.jobster.component.translation.view;


import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Translate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.fragment.Fragment;
import lombok.Getter;

/**
 * @author Jobster team
 * Since: 12/11/2024 12:03 PM
 */

@Getter
public abstract class AbstractTranslationFragment extends Fragment<VerticalLayout> {

    private Translate translation;

    private Language language;

    public void init(Translate translation, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean defaultLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
