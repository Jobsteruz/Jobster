package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.entity.core.PersonLanguage;
import com.smartbox.jobster.service.EducationService;
import com.smartbox.jobster.service.ExperienceService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.view.abstractview.DeferredLoads;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

/**
 * The education / experience / language history cards a person card shows.
 * <p>
 * Extracted from {@link AbstractPersonInfoFragment} so the read-only card and its edit form can
 * render the very same lists from one implementation: the edit fragments cannot inherit the
 * abstract fragment, their components sit under the same ids but are form fields rather than spans.
 */
@Component("jb_PersonHistoryBoxes")
public class PersonHistoryBoxes {

    /**
     * The target divs of one screen's education, experience and language sections. Both fragment
     * descriptors declare them under these ids.
     */
    public record Boxes(Div eduBoxBody, Div expBoxBody, Div lanEmptyBox, Div lanHistoryBox) {
    }

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Messages messages;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private EducationService educationService;
    @Autowired
    private ExperienceService experienceService;
    @Autowired
    private PersonService personService;

    /**
     * Fetches the education/experience/language lists on a worker thread and fills the boxes via
     * {@code ui.access}. These are the exact queries a prod thread dump caught holding the session
     * lock for 13-33 s inside the info-panel timer (getPersonLanguages,
     * getPersonExperiencesByEntityIdAndName) - the panel now opens immediately and the sections
     * fill in when the data arrives.
     */
    public void loadAsync(Person person, String locale, Boxes boxes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void buildExpBox(List<PersonExperience> experiences, Div expBoxBody) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void buildEduBox(List<PersonEducation> educations, Person person, Div eduBoxBody) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void buildLanBox(List<PersonLanguage> languages, String locale, Div lanEmptyBox, Div lanHistoryBox) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
