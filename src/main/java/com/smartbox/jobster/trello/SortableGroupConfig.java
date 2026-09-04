package com.smartbox.jobster.trello;

import com.vaadin.flow.component.JsonSerializable;
import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class SortableGroupConfig implements JsonSerializable {

    private String name;
    // put
    private final List<String> groupNameDragInAllowed = new ArrayList<>();
    // pull
    private final List<String> groupNameDragOutAllowed = new ArrayList<>();
    // pull
    private boolean dragOutAllowed = true;
    // pull
    private boolean clone;
    // put
    private boolean dragInAllowed;


    public void addDragInGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addDragOutGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public JsonObject toJson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public JsonSerializable readJson(JsonObject value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
