package com.smartbox.jobster.sortablelayout;

import com.vaadin.flow.component.JsonSerializable;
import elemental.json.Json;
import elemental.json.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortableConfig implements JsonSerializable {

    private final SortableGroupConfiguration group = new SortableGroupConfiguration();
    private boolean sort = true;
    private int delay = 0;
    private boolean delayOnTouchOnly;
    private int touchStartThreshold = 0;
    private boolean disabled = false;
    //store
    private int animation = 0;
    private final List<String> filterClassNames = new ArrayList<>();

    private String ghostClass; // Class name for the drop placeholder
    private String chosenClass; // Class name for the chosen item
    private String dragClass; // Class name for the dragging item

    private boolean multiDrag = false;

    private String selectedClass;

    public boolean isSort() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Enable sorting in this list, default true
     *
     * @param sort true to enable reordering
     */
    public void setSort(boolean sort) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getDelay() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * time in milliseconds to define when the sorting should start
     * Default 0
     * @param delay time in milliseconds
     */
    public void setDelay(int delay) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isDelayOnTouchOnly() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * only delay if user is using touch
     * default false
     * @param delayOnTouchOnly true to delay on touch
     */
    public void setDelayOnTouchOnly(boolean delayOnTouchOnly) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getTouchStartThreshold() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * px, how many pixels the point should move before cancelling a delayed drag event
     * @param touchStartThreshold value in px
     */
    public void setTouchStartThreshold(int touchStartThreshold) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isDisabled() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Disables the sortable if set to true.
     * default false
     * @param disabled true to disable the sort
     */
    public void setDisabled(boolean disabled) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getAnimation() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * animation speed moving items when sorting, `0` — without animation
     * default 150
     * @param animation time of the animation in ms
     */
    public void setAnimation(int animation) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addFilter(String filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public void clearFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * set the group name
     *
     * @param name group name
     */
    public void setGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * whether elements can be added from other lists.
     * - true to be able to move in the list
     * - false to allow only reorder
     * @see #addDragInGroupName(String) to restrict the group from which elements can be added.
     *
     * @param allowed Defaults to true.
     */
    public void allowDragIn(boolean allowed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Ability to move from the list.
     * - true to be able to move the items from the list
     * - false to allow only reorder
     * @see #addDragOutGroupName(String) to restrict the group which the elements may be put in
     *
     * See 'pull' in SortableJS
     *
     * @param allowed  Defaults to true.
     */
    public void allowDragOut(boolean allowed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * restrict the group from which elements can be added.
     *
     * @param name group name
     */
    public void addDragInGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * restrict the group which the elements may be put in
     *
     * @param name group name
     */
    public void addDragOutGroupName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    /**
     * Whether the previous list keeps a copy of the element
     * Warning: Can't be used with {@link #addDragOutGroupName(String)}
     * @param clone true to clone the item
     */
    public void cloneOnDragOut(boolean clone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getGhostClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * default sortable-ghost
     * @param ghostClass
     */
    public void setGhostClass(String ghostClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getChosenClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isMultiDrag() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setMultiDrag(boolean multiDrag) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Set the Class name for the chosen item
     * default sortable-chosen
     * @param chosenClass Class name for the chosen item
     */
    public void setChosenClass(String chosenClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getDragClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    /**
     * Set Class name for the dragging item
     * default sortable-drag
     * @param dragClass Class name for the dragging item
     */
    public void setDragClass(String dragClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getSelectedClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     *
     * @param selectedClass
     */
    public void setSelectedClass(String selectedClass) {
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

    boolean requireGroupStore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    boolean requireCloneFunction() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}