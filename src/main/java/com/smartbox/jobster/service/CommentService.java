package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.cms.Comment;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CommentService {
    @Autowired
    private DataManager dataManager;

    public List<Comment> getCommentsByStageHistoryId(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Batched {@link #getCommentsByStageHistoryId} — one query for a whole stage-history list. */
    public Map<UUID, List<Comment>> getCommentsByStageHistoryIds(Collection<UUID> ids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Every comment written on the entity itself plus the ones written on its stage-history cards —
     * the same set the person dialog shows, in one query. Ordered oldest first so report templates
     * and the AI assistant read the thread chronologically.
     * <p>
     * The author is fetched with the attributes {@code User.getDisplayName()} depends on: it is an
     * {@link io.jmix.core.metamodel.annotation.InstanceName} getter, so a plan carrying only
     * {@code username} makes every caller that renders the author blow up on an unfetched attribute.
     */
    public List<Comment> getCommentsByEntityIdAndName(UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
