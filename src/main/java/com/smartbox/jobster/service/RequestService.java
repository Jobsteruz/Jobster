package com.smartbox.jobster.service;


import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.pojo.VacancyAction;
import com.smartbox.jobster.pojo.VacancyToIshGOPojo;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.view.monitoring.AbstractMonitoring;
import com.smartbox.jobster.view.vacancy.VacancyDetailView;
import com.vaadin.flow.component.UI;
import io.jmix.core.*;
import io.jmix.core.entity.EntityValues;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.View;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/13/2024 11:20 AM
 */
@Service
public class RequestService {
    private static final Logger log = LoggerFactory.getLogger(RequestService.class);

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.vacancy-to-ishgo.routing-key}")
    private String routingKey;

    @Autowired
    private IntegratedVacancyService integratedVacancyService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private UserService userService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private MetadataTools metadataTools;
    @Autowired
    private Metadata metadata;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private KanbanService kanbanService;

    @PersistenceContext
    private EntityManager entityManager;


    public void rejectRequest(KanbanStage stage, Vacancy vacancy,
                              RequestCancelReason cancelReason, String comment, boolean manualClose) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void approveRequest(KanbanStage stage, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void autoCreateVacancyFromRequest(KanbanStage stage, Vacancy request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void closeRequest(KanbanStage stage, Vacancy request, RequestCancelReason cancelReason, String comment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Null out copied references whose target row is no longer visible.
     * <p>
     * {@link MetadataTools#copy} carries every reference of the source request into the new
     * vacancy, including ones pointing at rows that have since been soft-deleted — over a thousand
     * live requests/vacancies hold such a reference today, nearly all of them {@code schedule}.
     * That is not harmless: the target is invisible to the soft-delete filter, so EclipseLink's
     * existence check treats it as a brand-new object and aborts the flush with <em>"During
     * synchronization a new object was found through a relationship that was not marked cascade
     * PERSIST"</em>. The recruiter gets an unexpected-error dialog on Save, and
     * {@link #autoCreateVacancyFromRequest} silently produces no vacancy at all.
     * <p>
     * {@code @OnDeleteInverse(UNLINK)} on {@code Vacancy.schedule} stops new dangling references
     * appearing, but says nothing about the ones already in the data — hence this guard.
     * <p>
     * Existence is asked of the database rather than read off {@code deletedDate}: references are
     * fetched with {@code _instance_name}, which does not include that attribute, so inspecting it
     * would throw "Cannot get unfetched attribute" instead of answering the question.
     */
    private void dropVanishedReferences(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openedVacancyRequest(KanbanStage stage, Vacancy request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void openVacancy(KanbanStage stage, Vacancy request, View<?> origin, Optional<Runnable> openedListener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void closeVacancy(KanbanStage stage, Vacancy vacancy, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void forceCloseVacancy(KanbanStage stage, Vacancy vacancy, boolean manualClose, RequestCancelReason reason, String comment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private KanbanStageEntity statusVacancy(KanbanStage stage, Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private KanbanStage changeStage(Vacancy vacancy, RequestStatus status, KanbanStage fromStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<RequestStatusNotify> getRequestNotifications(UUID requestId, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Manager bot — manager o'z departamentlari VA ularning barcha sub-departamentlaridagi aktiv requestlarni ko'radi (ierarxik).
     * Aktiv = parent request (request is null), state=REQUEST, requestStatus PENDING/APPROVED/IN_PROGRESS.
     * Ierarxiya Department.hierarchicalKey prefiksi bo'yicha aniqlanadi (o'zi + barcha avlodlari).
     * Jobster3 RequestService.getParentRequestByManager ekvivalenti (author o'rniga department ierarxiyasi bo'yicha).
     */
    public List<Vacancy> getActiveRequestsByDepartments(List<Department> departments, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Berilgan requestlar uchun ochiq (yopilmagan) child vacancy sonini bitta so'rovda qaytaradi.
     * Map: requestId -> ochiq vacancy soni. ('Доступный/Available' ko'rsatkichi)
     */
    public Map<UUID, Long> getOpenChildVacancyCounts(List<Vacancy> requests) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public List<Object[]> getClosedRequestsByMonth(OffsetDateTime fromDate, OffsetDateTime toDate, User user,
                                                   Position position, Department department,
                                                   CancelReason cancelReason) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
