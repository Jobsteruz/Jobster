package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.WhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.quiz.consumer.WhatsappQuizConsumer;
import com.smartbox.jobster.bot.whatsapp.quiz.producer.WhatsappQuizProducer;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import com.smartbox.jobster.entity.quiz.QuizQuestion;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.smartbox.jobster.service.whatsapp.WhatsappMessengerFactory;
import com.whatsapp.api.domain.webhook.Message;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WhatsappQuiz {


    @Autowired
    private SequenceService sequenceService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;


    public <T extends Person> void sendQuiz(Quiz quiz, T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
