package com.smartbox.jobster.component.translation.view;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Translate;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("translation-fragment.xml")
public class TranslationFragment extends AbstractTranslationFragment {

    @ViewComponent
    private InstanceContainer<Translate> translationDc;
    @ViewComponent
    private JmixTextArea translatedField;

    @Override
    public void init(Translate translation, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}