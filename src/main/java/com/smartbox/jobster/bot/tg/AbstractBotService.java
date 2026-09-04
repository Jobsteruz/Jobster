package com.smartbox.jobster.bot.tg;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.service.questionnaire.QuestionAnswerService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.service.tg.MenuService;
import com.smartbox.jobster.service.tg.TelegramService;
import com.smartbox.jobster.service.tg.TgUserService;
import com.smartbox.jobster.service.zpcast.SalaryService;
import io.jmix.core.*;
import org.springframework.core.env.Environment;

/**
 * @author Jobster team
 * Since: 12/14/2023 3:30 PM
 */
public abstract class AbstractBotService implements BotComponent {

    private InstanceNameProvider instanceNameProvider;
    private BotService botService;
    private Messages messages;
    private Metadata metadata;
    private MenuService menuService;
    private MetadataTools metadataTools;
    private Environment environment;
    private EntityService entityService;
    private LanguageService languageService;
    private TranslateService translateService;
    private TelegramService telegramService;
    private TgUserService tgUserService;
    private TimeSource timeSource;
    private QuestionService questionService;
    private QuestionAnswerService questionAnswerService;
    private ApplicantService applicantService;
    private EmployeeService employeeService;
    private QuizService quizService;
    private SalaryService salaryService;
    private VacancyService vacancyService;
    private ChecklistService checklistService;
    private ReferenceService referenceService;
    private AttendanceService attendanceService;
    private FaceDetectionService faceDetectionService;
    private ScheduleService scheduleService;
    private EventService eventService;
    private SequenceService sequenceService;
    private PersonService personService;

    public InstanceNameProvider instanceNameProvider() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public BotService botService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Messages messages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Metadata metadata() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MenuService menuService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MetadataTools metadataTools() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Environment environment() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EntityService entityService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LanguageService languageService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TranslateService translateService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TelegramService telegramService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgUserService tgUserService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TimeSource timeSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionService questionService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionAnswerService questionAnswerService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ApplicantService applicantService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EmployeeService employeeService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuizService quizService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SalaryService salaryService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VacancyService vacancyService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ChecklistService checklistService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ReferenceService referenceService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AttendanceService attendanceService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FaceDetectionService faceDetectionService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ScheduleService scheduleService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EventService eventService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SequenceService sequenceService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PersonService personService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
