package com.smartbox.jobster.sortablelayout;

import com.vaadin.flow.component.JsonSerializable;
import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jcgueriaud
 */
public class SortableGroupConfiguration implements JsonSerializable {

    private String name;
    // put
    private final List<String> groupNameDragInAllowed = new ArrayList<>();
    // pull
    private final List<String> groupNameDragOutAllowed = new ArrayList<>();
    // pull
    private boolean dragOutAllowed = true;
    // pull
    private boolean clone = false;
    // put
    private boolean dragInAllowed = false;


    public String getName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Set the group name
     *
     * @param name group name
     */
    public void setName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isDragOutAllowed() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Ability to move from the list.
     * - true to be able to move the items from the list
     * - false to allow only reorder
     * @see #addDragOutGroupName(String) to restrict the group which the elements may be put in
     *
     * @param dragOutAllowed  Defaults to true.
     */
    public void setDragOutAllowed(boolean dragOutAllowed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isDragInAllowed() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * whether elements can be added from other lists.
     * - true to be able to move in the list
     * - false to allow only reorder
     * @see #addDragInGroupName(String) to restrict the group from which elements can be added.
     *
     * @param dragInAllowed Defaults to true.
     */
    public void setDragInAllowed(boolean dragInAllowed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     *
     * @param name group name
     */
    public void addDragInGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     *
     * @param name group name
     */
    public void addDragOutGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isClone() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Whether the previous list keeps a copy of the element
     * Warning: Can't be used with {@link #addDragOutGroupName(String)}
     * @param clone true to clone the item
     */
    public void setClone(boolean clone) {
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