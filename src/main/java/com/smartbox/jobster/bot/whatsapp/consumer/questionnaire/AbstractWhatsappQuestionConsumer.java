package com.smartbox.jobster.bot.whatsapp.consumer.questionnaire;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.WhatsappFile;
import com.smartbox.jobster.bot.whatsapp.consumer.WhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.questionnaire.AbstractWhatsappQuestionObject;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.JbTenantEntity;
import com.smartbox.jobster.entity.questionnaire.*;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.datatype.EnumClass;
import io.jmix.core.metamodel.model.MetaClass;
import jakarta.persistence.Entity;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.regex.Pattern;

public abstract class AbstractWhatsappQuestionConsumer extends AbstractWhatsappQuestionObject implements WhatsappConsumer {

    private static final Logger log = LoggerFactory.getLogger(AbstractWhatsappQuestionConsumer.class);

    private Question question;
    protected FileRef fileRef = null;


    protected AbstractWhatsappQuestionConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected void makeQuestionAnswer(boolean link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected String getText(boolean link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected Object setEntityProperty(boolean link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected boolean isValidFormat() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean validateFile() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected boolean invalidRequest() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Question question() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
