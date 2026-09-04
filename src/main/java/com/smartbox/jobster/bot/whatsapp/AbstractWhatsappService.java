package com.smartbox.jobster.bot.whatsapp;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.ref.WhatsappSetting;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.entity.whatsapp.WhatsappMenu;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.person.PersonActionService;
import com.smartbox.jobster.service.questionnaire.QuestionAnswerService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.service.tg.MenuService;
import com.smartbox.jobster.service.tg.TelegramService;
import com.smartbox.jobster.service.tg.TgUserService;
import com.smartbox.jobster.service.whatsapp.*;
import com.smartbox.jobster.service.zpcast.SalaryService;
import com.whatsapp.api.domain.media.MediaFile;
import com.whatsapp.api.domain.messages.Message;
import com.whatsapp.api.domain.messages.TextMessage;
import com.whatsapp.api.domain.webhook.Audio;
import com.whatsapp.api.domain.webhook.Document;
import com.whatsapp.api.domain.webhook.Image;
import com.whatsapp.api.domain.webhook.Video;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.lang.NonNull;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class AbstractWhatsappService implements WhatsappInteractiveMessenger {

    private static final Logger log = LoggerFactory.getLogger(AbstractWhatsappService.class);
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
    private PersonActionService personActionService;
    private QuizService quizService;
    private SalaryService salaryService;
    private VacancyService vacancyService;
    private ChecklistService checklistService;
    private AppSettings appSettings;
    private FetchPlans fetchPlans;
    private FileStorage fileStorage;
    private SequenceService sequenceService;
    private EventService eventService;

    private WhatsappMessengerService whatsappMessengerService;
    private WhatsappMenuService whatsappMenuService;
    private WhatsappUserService whatsappUserService;
    private WhatsappBotService whatsappBotService;

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

    public AppSettings appSettings() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FetchPlans fetchPlans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappMessengerService whatsappMessenger() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappUserService whatsappUserService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappMenuService whatsappMenuService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappBotService whatsappBotService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FileStorage fileStorage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PersonActionService personActionService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String makeFileUrl(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public WhatsappMessengerService messenger() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected <T extends JbEntity<UUID>> T save(T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected WhatsappUser saveUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected WhatsappBot getBot() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected WhatsappUser getUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Language getLanguage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected String getLocaleOrDefault(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected FileRef saveFile() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected FileRef saveFile(MediaFile mediaFile) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @NonNull
    protected String getLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected String translateEnum(Enum<?> anEnum) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected String translateSettingType(SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected String translateEntity(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Collection<InlineMarkup> convertMenus2InlineMarkup(Collection<WhatsappMenu> menus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Message makeBigTextMessage(List<InlineMarkup> markups) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public SequenceService sequenceService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public EventService eventService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected WhatsappFile getFile() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
