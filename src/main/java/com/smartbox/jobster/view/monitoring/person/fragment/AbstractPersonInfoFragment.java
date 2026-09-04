package com.smartbox.jobster.view.monitoring.person.fragment;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.*;
import com.smartbox.jobster.entity.hrm.Education;
import com.smartbox.jobster.entity.hrm.Experience;
import com.smartbox.jobster.service.TranslateService;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Jobster team
 * Since: 10/24/2024 11:34 AM
 */
public abstract class AbstractPersonInfoFragment<T extends Person> extends Fragment<VerticalLayout> {
    protected static final String EMPTY = "------";

    protected T person;

    @Autowired
    protected Messages messages;
    @Autowired
    protected ViewNavigators viewNavigators;
    @Autowired
    protected TranslateService translateService;
    @Autowired
    protected PersonHistoryBoxes personHistoryBoxes;

    //personal-info
    @ViewComponent
    private Span firstName;
    @ViewComponent
    private Span lastName;
    @ViewComponent
    private Span middleName;
    @ViewComponent
    private Span birthDate;
    @ViewComponent
    private Span gender;
    @ViewComponent
    private Span maritalStatus;
    @ViewComponent
    private Span numOfChildren;

    //personal-contact
    @ViewComponent
    private Span email;
    @ViewComponent
    private Span phone;
    @ViewComponent
    private Span phone2;

    //personal-address
    @ViewComponent
    private Span country;
    @ViewComponent
    private Span region;
    @ViewComponent
    private Span address;
    @ViewComponent
    private Span address2;
    @ViewComponent
    private Span postalCode;
    @ViewComponent
    private Span location;

    //personal-passport
    @ViewComponent
    private Span resident;
    @ViewComponent
    private Span passportNumber;
    @ViewComponent
    private Span pinfl;
    @ViewComponent
    private Span passportMemo;
    @ViewComponent
    private Span passportIssuedBy;
    @ViewComponent
    private Span passportDateOfIssue;
    @ViewComponent
    private Span passportExpiredDate;

    //personal-education
    @ViewComponent
    private Span education;

    //personal-experience
    @ViewComponent
    private Span experience;

    @ViewComponent
    private Div expHistoryBox;
    @ViewComponent
    private Div eduHistoryBox;

    @ViewComponent
    private Div lanEmptyBox;
    @ViewComponent
    private Div lanHistoryBox;
    @ViewComponent
    private Div eduBoxBody;
    @ViewComponent
    private Div expBoxBody;

    public abstract String locale();

    protected void initInfo(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void initContact(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void initAddress(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void initPassport(Passport passport) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void initEducation(Person person, Education education) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void initExperience(Person person, Experience experience) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Fills the education, experience and language sections. Delegates to {@link PersonHistoryBoxes}
     * so this card and the matching edit form render one and the same lists.
     */
    protected void loadHistoryBoxesAsync() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
