package com.smartbox.jobster.view.abstractview;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.PersonContactComponent;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.entity.core.PersonContact;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.downloadresume.DownloadResumeView;
import com.smartbox.jobster.view.employee.AbstractPersonComponentListView;
import com.smartbox.jobster.view.employee.persondocument.PersonDocumentListView;
import com.smartbox.jobster.view.employee.personeducation.PersonEducationListView;
import com.smartbox.jobster.view.employee.personexperience.PersonExperienceListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.component.accordion.JmixAccordionPanel;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "abstract-person-info-view", layout = MainView.class)
@ViewController("jb_AbstractPersonInfoView")
@ViewDescriptor("abstract-person-info-view.xml")
@DialogMode(width = "80em", height = "100%")
public abstract class AbstractPersonInfoView<T extends Passport> extends StandardView {
    protected static final String defaultEmptyString = "-----";
    protected T person;

    @Autowired
    protected Messages messages;
    @Autowired
    protected InstanceNameProvider instanceNameProvider;
    @ViewComponent
    protected MessageBundle messageBundle;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;

    @ViewComponent
    private Span codeValue;
    @ViewComponent
    private JmixAccordion informationAccordion;
    @ViewComponent
    private JmixImage<FileRef> personPhoto;
    @ViewComponent
    private H4 fullName;
    @ViewComponent
    private JmixAccordion passportAccordion;
    @ViewComponent
    private Span passportNumber;
    @ViewComponent
    private Span pinfl;
    @ViewComponent
    private Span passportIssueDate;
    @ViewComponent
    private Span passportExpiredDate;
    @ViewComponent
    private Span passportIssuedBy;
    @ViewComponent
    private JmixAccordion addressAccordion;
    @ViewComponent
    private Span region;
    @ViewComponent
    private Span country;
    @ViewComponent
    private Span postalCode;
    @ViewComponent
    private Span address1;
    @ViewComponent
    private Span address2;
    @ViewComponent
    private JmixAccordion contactAccordion;
    @ViewComponent
    private Anchor phone;
    @ViewComponent
    private Anchor phone2;
    @ViewComponent
    private Anchor email;
    @ViewComponent
    private CollectionLoader<PersonContact> personContactDl;
    @ViewComponent
    private CollectionContainer<PersonContact> personContactDc;
    @ViewComponent
    private HorizontalLayout contacts;
    @ViewComponent
    private JmixAccordion informationWorkAccordion;
    @ViewComponent
    private JmixAccordion educationsAccordion;
    @ViewComponent
    private JmixAccordion documentsAccordion;
    @ViewComponent
    private JmixAccordion additionalInformationAccordion;
    @ViewComponent
    private Span score;
    @ViewComponent
    private Span category;
    @ViewComponent
    private Span group;
    @ViewComponent
    private Span description;
    @ViewComponent
    private JmixAccordion experienceAccordion;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "downloadResume", subject = "clickListener")
    public void onDownloadResumeClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    abstract protected Class<T> getPersonClass();

    @SuppressWarnings("ConstantConditions")
    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <E extends StandardTenantEntity> AbstractPersonComponentListView<E> createListView(Class<? extends AbstractPersonComponentListView<E>> listView) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    abstract protected void setUpInformationWorkAccordion();

    protected void setUpInformationAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpPassportAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpAddressAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpContactAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setUpAdditionalInformationAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected HorizontalLayout getAccordionHeader(String title, VaadinIcon icon) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPerson(String personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}