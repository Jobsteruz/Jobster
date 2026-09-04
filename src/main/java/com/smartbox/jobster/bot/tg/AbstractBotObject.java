package com.smartbox.jobster.bot.tg;

import com.pengrad.telegrambot.model.*;
import com.pengrad.telegrambot.model.request.*;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.quiz.QuizData;
import com.smartbox.jobster.entity.company.Branch;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonAnswer;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.*;
import io.jmix.core.FileRef;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

import java.time.OffsetDateTime;
import java.util.*;

/**
 * @author Jobster team
 * Date: 28.08.2022 10:05
 */

@Getter
public abstract class AbstractBotObject extends AbstractBotService {

    protected BotContext botContext;

    public AbstractBotObject(@NotNull BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String text() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String caption() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Contact contact() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Location location() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgFile file() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Language language() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Locale locale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgUser getTgUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public StandardQuestionnaireEntity getEntity(Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Bot getBot() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updateTgUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String translateEnum(Enum<?> anEnum) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String enumKey(Enum<?> anEnum) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String clearTranslateSettingType(SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String translateSettingType(SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String clearTranslateSettingType(SettingType type, Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String translateSettingType(SettingType type, Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String translateSetting(Setting setting, SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String translateEntity(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendPost(Post post) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(String text, Format format) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(String text, Format format, FileRef file, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(String text, Format format, String fileUrl, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void editMessage(Integer messageId, String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void deleteMessage(Integer messageId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void answerCallBackMessage(String text, String callbackId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean permittedMenu(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean hideMenu(Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Keyboard inlineMenuKeyboard(List<Menu> childMenus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Keyboard replyMenuKeyboard(List<Menu> childMenus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String makeWebAppUrl(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Keyboard replyKeyboard(List<List<KeyboardButton>> buttonsList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Keyboard inlineKeyboard(List<List<InlineKeyboardButton>> buttonsList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Keyboard quizQuestionKeyboard(QuizPersonQuestion quizPersonQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Tanlangan entity haqida ma'lumot yuboradi: filial/bo'lim uchun manzil + xarita (LOCATION),
     * vakansiya/lavozim uchun vakansiya ma'lumoti. Region/Category uchun hech narsa yubormaydi.
     */
    public void sendEntityInfo(JbEntity<UUID> entity, Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendDepartmentInfo(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendVacancyInfo(Questionnaire questionnaire, Vacancy vacancy, Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getConditions(String responsibility, JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean checkLimit(QuizPerson quizPerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected List<List<KeyboardButton>> entityButtons(Question question, List<String> values) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void sendConfirmationAndCleanup(Logger logger) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
