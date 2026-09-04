package com.smartbox.jobster.component.translation.view;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Translate;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("rich-translation-fragment.xml")
public class RichTranslationFragment extends AbstractTranslationFragment {

    @ViewComponent
    private InstanceContainer<Translate> translationDc;
    @ViewComponent
    private RichTextEditor translatedField;

    @Override
    public void init(Translate translation, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}