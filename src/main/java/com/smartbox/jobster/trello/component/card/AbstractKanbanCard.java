package com.smartbox.jobster.trello.component.card;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.QuizService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.trello.component.AbstractStageComponent;
import io.jmix.core.*;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.view.View;
import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 26/08/24 17:20
 */
public abstract class AbstractKanbanCard extends AbstractStageComponent {

    @Getter
    protected final View<?> origin;
    protected CardProperties properties;

    private Dialogs dialogs;
    private Messages messages;
    private EntityService entityService;
    private QuizService quizService;
    private KanbanStageEntityService kanbanStageEntityService;
    private KanbanService kanbanService;
    private DepartmentService departmentService;
    private Metadata metadata;
    private MetadataTools metadataTools;
    private MessageTools messageTools;
    private UiComponents uiComponents;
    private DialogWindows dialogWindows;
    private TranslateService translateService;
    private TimeSource timeSource;
    private KanbanStageHistoryService kanbanStageHistoryService;
    private InstanceNameProvider instanceNameProvider;

    public abstract UUID getCardId();

    protected AbstractKanbanCard(View<?> origin, KanbanStage stage, CardProperties properties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Dialogs getDialogs() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Messages getMessages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EntityService getEntityService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuizService getQuizService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public KanbanService getKanbanService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public DepartmentService getDepartmentService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Metadata getMetadata() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MetadataTools getMetadataTools() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MessageTools getMessageTools() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public UiComponents getUiComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public DialogWindows getDialogWindows() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TranslateService getTranslateService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStageEntityService getKanbanStageEntityService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TimeSource getTimeSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStageHistoryService getKanbanStageHistoryService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public InstanceNameProvider getInstanceNameProvider() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
