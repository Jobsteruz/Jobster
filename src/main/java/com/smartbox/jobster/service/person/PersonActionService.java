package com.smartbox.jobster.service.person;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.BannedPerson;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.integration.hh.HHStage;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.smartbox.jobster.pojo.ApplicantIshGOPojo;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHApplicantService;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import io.jmix.core.*;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 9/24/2024 12:46 PM
 */
@Service
public class PersonActionService {

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.applicant-ishgo.routing-key}")
    private String routingKey;

    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private UserService userService;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private HHApplicantService hhApplicantService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private EntityService entityService;
    @Autowired
    private QueryTransformerFactory queryTransformerFactory;

    public void rejectPerson(KanbanStage stage, Person person,
                             CancelReason cancelReason, String comment,
                             AutoFillTemplate template, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void rejectPerson(KanbanStage stage, Person person,
                             CancelReason cancelReason, String comment,
                             Vacancy vacancy,
                             AutoFillTemplate template, List<Platform> platforms, boolean isWebhook) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Returns the reject reason previously selected by a manager for this person via the
     * manager-feedback flow ({@link KanbanStageHistory} with a manager response, REJECTED status
     * and a cancel reason). Used to pre-fill the reject dialog so the recruiter does not have to
     * re-pick the reason the manager already chose. Returns {@code null} if no such reason exists.
     */
    public CancelReason getManagerRejectReason(UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void banPerson(KanbanStage stage, Person person,
                          CancelReason cancelReason, String comment,
                          AutoFillTemplate template, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void reservePerson(KanbanStage stage, Person person, String comment,
                              AutoFillTemplate template, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void reservePerson(KanbanStage stage, Person person, String comment,
                              Vacancy vacancy, AutoFillTemplate template, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void restorePerson(KanbanStage stage, Person person, String comment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void exitEmployee(Employee employee, ExitReason exitReason, Employee user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isBanned(WhatsappUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean isBanned(String tenantId, TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void admitPerson(KanbanStage stage, Person person, String comment,
                            AutoFillTemplate template, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void deleteUserFromBlackList(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
