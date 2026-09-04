package com.smartbox.jobster.service.kanban;

import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Moves a candidate on to the next stage the moment the manager attached to them approves, for the
 * stages that ask for it ({@link KanbanStage#getEnableAutoNextStage()}).
 * <p>
 * Shared by every place a manager verdict can arrive from — the Telegram card, the emailed
 * feedback page, the mobile app and its REST twin — so the transition does not depend on which
 * channel the manager happened to answer through. Each of those saves the verdict onto the stage
 * history first and calls this afterwards: the approval is the record, the transfer is a
 * consequence of it, and a transfer that fails must never cost the verdict.
 */
@Service
public class ManagerAcceptStageTransferService {
    private static final Logger log = LoggerFactory.getLogger(ManagerAcceptStageTransferService.class);

    @Autowired
    private DataManager dataManager;
    @Autowired
    private KanbanActionService kanbanActionService;

    /**
     * @param stageHistory the row the verdict was just written to; only its id is read, so a
     *                     partially fetched instance from any caller's fetch plan is fine.
     */
    public void transferOnManagerAccept(@Nullable KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void transferOnManagerAccept(UUID stageHistoryId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @return the stage that follows {@code currentStage} on the board, or null on the last one.
     * <p>
     * Resolved by walking the ordered stage list rather than by asking for the first stage with a
     * bigger {@code sort}: stages of one kanban are allowed to share a sort value (four kanbans in
     * production do), and "greater than" would jump straight over the twin. Hidden and inactive
     * stages are left out of the candidates the way the board leaves them out — auto-moving someone
     * onto a stage nobody can see would make them vanish — but the current stage is kept in the
     * list unconditionally, so a candidate parked on a hidden stage still has a successor.
     */
    @Nullable
    private KanbanStage nextStage(KanbanStage currentStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
