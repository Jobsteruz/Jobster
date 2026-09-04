package com.smartbox.jobster.trello;

import com.smartbox.jobster.view.monitoring.loader.KanbanLoader;
import com.vaadin.flow.component.JsonSerializable;
import elemental.json.Json;
import elemental.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
public class SortableConfig implements JsonSerializable {
    private final SortableGroupConfig group = new SortableGroupConfig();
    private boolean sort;
    private int delay;
    private int maxItemsCountPerFetch;
    private int loadItemsThreshold;
    private boolean delayOnTouchOnly;
    private int touchStartThreshold;
    private boolean disabled;
    private int animation;
    private final List<String> filterClassNames = new ArrayList<>();

    private String ghostClass; // Class name for the drop placeholder
    private String chosenClass; // Class name for the chosen item
    private String dragClass; // Class name for the dragging item

    private boolean multiDrag;
    private String selectedClass;

    public static SortableConfig getDefaultSortableConfig() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void setGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void allowDragIn(boolean allowed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void allowDragOut(boolean allowed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public JsonObject toJson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Deprecated
    @Override
    public JsonSerializable readJson(JsonObject value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean requireGroupStore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
