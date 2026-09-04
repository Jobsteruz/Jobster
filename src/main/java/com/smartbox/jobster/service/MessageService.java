package com.smartbox.jobster.service;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Message;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.MessageKeyboard;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgChannel;
import com.smartbox.jobster.pojo.MailPojo;
import com.smartbox.jobster.pojo.MessagePojo;
import com.smartbox.jobster.pojo.SmsPojo;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.tg.TgChannelService;
import com.smartbox.jobster.view.message.MessageDetailView;
import com.smartbox.jobster.view.message.SendMessageFilter;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.IntConsumer;

@Service
@RequiredArgsConstructor
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);
    private static final int MASS_SEND_CHUNK = 500;

    private final TgChannelService tgChannelService;
    private final EntityService entityService;
    private final EmployeeService employeeService;
    private final TimeSource timeSource;
    private final SystemAuthenticator systemAuthenticator;

    @Value("${app.url}")
    private String appUrl;

    private final TenantProvider tenantProvider;
    private final MQService mqService;
    private final DataManager dataManager;
    private final ApplicantService applicantService;
    private final Messages messages;
    private final TranslateService translateService;
    private final VacancyService vacancyService;
    private final TemplatesService templatesService;
    private final MessageHistoryService messageHistoryService;

    public TgMessagePojo genTgMessagePojo(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgMessagePojo setVacancyInfo(Vacancy vacancy, String username, MessageDetailView.TgUserDTO tgUser, TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendToEmail(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendToSMS(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatAndGetVacancyInfo(Vacancy vacancy, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatAndGetVacancyInfo(Vacancy vacancy, String locale, String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<MessagePojo> getAllNotSentMessagesByNow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void putMqMassSending(MessagePojo messagePojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Mass-send in chunks of {@value #MASS_SEND_CHUNK}: one INSERT transaction per chunk
     * (discardSaved skips the per-row reload SELECT) and MQ publish strictly after the chunk's
     * commit, so a consumer can never receive a messageHistoryId that is not yet visible.
     * The pojos are mutated and re-published per recipient — safe because the MQ template
     * serializes at publish time. Returns the number of recipients processed.
     */
    public long sendMassBatch(Collection<MessageDetailView.TgUserDTO> tgUsers,
                              Message message, Platform platform,
                              TgMessagePojo tgMessagePojo,
                              List<Vacancy> vacancies,
                              TgMessagePojo vacancyMessagePojo,
                              Map<UUID, String> vacancyMap,
                              Employee employee,
                              IntConsumer progress) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void sendToTelegramChannels(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public record TgUserDTO(UUID botId, Long chatId, String locale) {
    }
}
