package com.smartbox.jobster.view.exitemployee;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.ExitEmployee;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.survey.*;
import com.smartbox.jobster.pojo.SurveyPojo;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.person.PersonActionService;
import com.smartbox.jobster.service.survey.SurveyQuestionService;
import com.smartbox.jobster.service.survey.SurveyService;
import com.smartbox.jobster.service.survey.SurveyUserAnswerService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.Route;
import io.jmix.core.*;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import java.util.*;

@Route(value = "exitEmployees/:id", layout = MainView.class)
@ViewController("jb_ExitEmployee.detail")
@ViewDescriptor("exit-employee-detail-view.xml")
@EditedEntityContainer("exitEmployeeDc")
@DialogMode(width = "70em", height = "90%")
public class ExitEmployeeDetailView extends AbstractDetailView<ExitEmployee> {
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.survey.routing-key}")
    private String routingKey;

    /**
     * -- SETTER --
     *  Dialog entry point — the monitoring board opens this view without query parameters,
     *  so it hands the employees over directly.
     */
    @Setter
    private List<Employee> employees;
    private UUID presetTemplateId;
    private final List<MultiAnswerFragment> multiAnswerFragments = new ArrayList<>();

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private SurveyQuestionService surveyQuestionService;
    @Autowired
    private Fragments fragments;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private MetadataTools metadataTools;
    @Autowired
    private SurveyUserAnswerService surveyUserAnswerService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private Messages messages;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @Autowired
    private PersonActionService personActionService;
    @ViewComponent
    private VerticalLayout employeesLayout;
    @ViewComponent
    private VerticalLayout right;
    @ViewComponent
    private JmixImage<Object> img;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private VerticalLayout surveyQuestion;
    @ViewComponent
    private EntityComboBox<Survey> managerSurvey;
    @ViewComponent
    private HorizontalLayout layout;
    @ViewComponent
    private EntityComboBox<Survey> employeeSurvey;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private JmixTextArea rejectSms;
    @ViewComponent
    private JmixRichTextEditor rejectMessage;
    @ViewComponent
    private JmixCheckboxGroup<Platform> platformBox;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> rejectTemplate;
    @ViewComponent
    private CollectionContainer<AutoFillTemplate> templateDc;
    @Autowired
    private SurveyService surveyService;

    /**
     * Pre-selects the message configured on the kanban stage ("Отказ адаптации" template),
     * exactly like the reject / reserve / blacklist actions already do.
     */
    public void setPresetTemplate(@Nullable AutoFillTemplate template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Resolved out of {@code templateDc} rather than used as handed in: the stage carries the
     * template under an {@code _instance_name} plan, and the value-change listener below needs
     * {@code body} / {@code smsBody} to fill the message in.
     */
    private void preselectTemplate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("rejectTemplate")
    public void onRejectTemplateComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<AutoFillTemplate>, AutoFillTemplate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<ExitEmployee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendRejectMsg(Employee employee, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendEmployeeSurvey(Employee employee, Survey survey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("managerSurvey")
    public void onManagerSurveyComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Survey>, Survey> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpSurvey(Survey survey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addConditionLayouts(SurveyQuestion question, AbstractAnswerFragment fragment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpFragment(AbstractAnswerFragment fragment, SurveyQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SurveyUserAnswer getSurveyUserAnswer(SurveyQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "managerSurvey", subject = "itemLabelGenerator")
    private String managerSurveyItemLabelGenerator(final Survey survey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "employeeSurvey", subject = "itemLabelGenerator")
    private String employeeSurveyItemLabelGenerator(final Survey survey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}