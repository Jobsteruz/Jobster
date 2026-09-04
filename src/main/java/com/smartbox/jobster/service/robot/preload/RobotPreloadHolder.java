package com.smartbox.jobster.service.robot.preload;

import org.jetbrains.annotations.Nullable;

/**
 * Thread-local carrier of the per-run {@link RobotPreloadData}. Set ONLY around the condition
 * match call in {@code RobotService.runRobot} — never around action execution, so actions always
 * read live data. The owning services ({@code QuizService}, {@code QuestionAnswerService},
 * {@code AdditionalQuestService}, {@code KanbanStageHistoryService}) consult it first and fall
 * back to their per-entity queries when absent, which keeps every non-robot caller unaffected.
 */
public final class RobotPreloadHolder {

    private static final ThreadLocal<RobotPreloadData> HOLDER = new ThreadLocal<>();

    private RobotPreloadHolder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void set(@Nullable RobotPreloadData data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static RobotPreloadData get() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void clear() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
