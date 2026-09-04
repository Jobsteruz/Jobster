package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.service.QuizService;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Writes the result of quiz attempts whose time ran out.
 * <p>
 * The bot and the web timer finalise an attempt the moment the candidate hits the wall, but only
 * if they are still there — most abandoned attempts are simply never touched again (a closed chat,
 * a closed tab), and until this job existed nothing ever came back to them: {@code score} stayed
 * null for good even though the points were sitting in the answered questions. Robot conditions
 * read that column, so those candidates fell out of every quiz-based rule.
 * <p>
 * Pinned to the MQ node like the other sweeps — four nodes running the same UPDATE set concurrently
 * is duplicated work at best. Runs cross-tenant under the system user: a system authentication
 * carries no tenant, which is exactly what lifts Jmix's tenant predicate off the query (and, on the
 * way back, keeps {@code TenantPersistingListener} from re-stamping the rows it saves).
 */
@Slf4j
@Component("jb_CronQuizExpiryJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class CronQuizExpiryJob {

    /**
     * Attempts finalised per run. The first run after a deploy has the whole historical backlog to
     * work through (~7k rows), which is not worth doing in one transaction burst — the cap drains
     * it over the following runs instead.
     */
    private static final int BATCH_SIZE = 1000;

    private final SystemAuthenticator systemAuthenticator;
    private final QuizService quizService;

    @Scheduled(cron = "0 */10 * * * ?", zone = "Asia/Tashkent", scheduler = "quizExpiryJobScheduled")
    public void finalizeExpiredAttempts() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
