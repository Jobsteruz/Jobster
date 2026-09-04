package com.smartbox.jobster.service.robot.preload;

import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Snapshot of the DB-backed robot-condition data for ONE robot run, batch-loaded up front by
 * {@link RobotConditionPreloadService} instead of queried once per entity inside the matchers.
 * <p>
 * Coverage semantics matter: an accessor may only be trusted after the corresponding
 * {@code covers*} check returns true — "covered but absent" means the DB has no row (the matcher
 * must see exactly the null/empty the per-entity query would have returned), while "not covered"
 * means the family was never preloaded and the owning service must fall back to its per-entity
 * query.
 */
public final class RobotPreloadData {

    private final Set<UUID> coveredQuizzes = new HashSet<>();
    private final Map<String, QuizPerson> lastQuizPersons = new HashMap<>();

    private final Set<UUID> coveredQuestions = new HashSet<>();
    private final Map<String, List<QuestionAnswer>> questionAnswers = new HashMap<>();

    private final Set<UUID> coveredTempQuestionnaires = new HashSet<>();
    // Found keys tracked separately from the scores: a found attempt may legitimately carry a
    // null score (no answers), which must stay distinguishable from "no finished attempt at all".
    private final Set<String> tempQuestionnaireFound = new HashSet<>();
    private final Map<String, Double> tempQuestionnaireScores = new HashMap<>();

    private final Set<UUID> coveredKanbans = new HashSet<>();
    private final Map<String, PersonStatus> managerStatuses = new HashMap<>();
    private final Set<String> managerReviewed = new HashSet<>();


    // --- quiz (QuizService.getLastQuizPerson) ---

    public void markQuizCovered(UUID quizId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean coversQuiz(UUID quizId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Rows arrive ordered endDate desc, so the first row per (quiz, person) is the latest one. */
    public void putLastQuizPersonIfAbsent(UUID quizId, UUID personId, QuizPerson quizPerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public QuizPerson lastQuizPerson(UUID quizId, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // --- questionnaire answers (QuestionAnswerService.getQuestionAnswers) ---

    public void markQuestionCovered(UUID questionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean coversQuestion(UUID questionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addQuestionAnswer(UUID questionId, UUID entityId, QuestionAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<QuestionAnswer> questionAnswers(UUID questionId, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // --- temp questionnaire (AdditionalQuestService.getLastPersonScoreOrThrowError) ---

    public void markTempQuestionnaireCovered(UUID tempQuestionnaireId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean coversTempQuestionnaire(UUID tempQuestionnaireId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean tempQuestionnaireFound(UUID tempQuestionnaireId, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void putTempQuestionnaireScore(UUID tempQuestionnaireId, UUID personId, @Nullable Double score) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public Double tempQuestionnaireScore(UUID tempQuestionnaireId, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // --- manager response (KanbanStageHistoryService.currentStageHistoryStatus / isReviewedStageEntity) ---

    public void markKanbanCovered(UUID kanbanId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean coversKanban(UUID kanbanId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void putManagerStatus(UUID kanbanId, UUID entityId, @Nullable PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public PersonStatus managerStatus(UUID kanbanId, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void putManagerReviewed(UUID kanbanId, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean managerReviewed(UUID kanbanId, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private static String key(UUID a, UUID b) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
