package com.smartbox.jobster.sortablelayout;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.shared.ui.LoadMode;
import elemental.json.JsonArray;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.lang.Integer.min;

/**
 * This invisible layout adds drag and drop capacity to the component added.
 *
 *
 */
@Tag("sortable-layout")
@NpmPackage(value = "sortablejs", version = "1.15.3")
@JavaScript(value = "./themes/jobster/js/sortable.js", loadMode = LoadMode.LAZY)
public class SortableLayout extends Div {

    private final Logger logger = Logger.getLogger("SortableLayout");

    @FunctionalInterface
    public interface CloneFunction {

        /**
         * Clone the component
         *
         * @param component component to clone
         * @return clone of the component
         */
        Component clone(Component component);
    }

    private CloneFunction cloneFunction;
    private SerializableConsumer<Component> onOrderChanged;

    private final Component layout;

    private boolean disabledSort = false;

    private Supplier<List<Component>> supplyComponentFunction;
    private Consumer<Component> storeComponentFunction;
    private Runnable clearComponentFunction;

    /**
     * Make the layout reorderable
     *
     * @param layout component to be reordered must implements HasComponents
     */
    public SortableLayout(Component layout) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SortableLayout(Component layout, SortableConfig config) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SortableLayout(Component layout, SortableConfig config, SortableGroupStore groupStore) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SortableLayout(Component layout, SortableConfig config,
                          SortableGroupStore groupStore, CloneFunction cloneFunction) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initConnector(Element layout, SortableConfig config) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void runBeforeClientResponse(SerializableConsumer<UI> command) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isDisabledSort() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Disables the sortable if set to true.
     *
     * @param disabled
     */
    public void setDisabledSort(boolean disabled) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Drag handle selector within list items
     * @param cssClassname classname of the element to drag
     */
    public void setHandle(String cssClassname) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAnimation(int value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setOption(String option, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setOption(String option, boolean value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setOption(String option, int value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    private void onReorderListener(JsonArray oldIndexes, JsonArray newIndexes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    protected void onAddListener(JsonArray newIndexes, boolean clone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    private void onRemoveListener(JsonArray oldIndexes, boolean clone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @deprecated  use the listener addSortableComponentReorderListener instead
     *
     * @param onOrderChanged function called when a component is reordered or moved
     */
    @Deprecated
    public void setOnOrderChanged(SerializableConsumer<Component> onOrderChanged) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     *
     * @return the list of components in the right order
     */
    public List<Component> getComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component getLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    private void setGroup(SortableGroupStore group) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    /**
     * Adds a add listener to this component. Called when a component is dropped inside the component
     *
     * @param listener the listener to add, not <code>null</code>
     * @return a handle that can be used for removing the listener
     */
    public Registration addSortableComponentAddListener(ComponentEventListener<SortableComponentAddEvent> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    /**
     * Adds a delete listener to this component. Called when a component is dropped outside the component
     *
     * @param listener the listener to add, not <code>null</code>
     * @return a handle that can be used for removing the listener
     */
    @SuppressWarnings("unchecked")
    public Registration addSortableComponentDeleteListener(ComponentEventListener<SortableComponentDeleteEvent> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    /**
     * Adds a reorder listener to this component.
     *
     * @param listener the listener to add, not <code>null</code>
     * @return a handle that can be used for removing the listener
     */
    @SuppressWarnings("unchecked")
    public Registration addSortableComponentReorderListener(ComponentEventListener<SortableComponentReorderEvent> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static class SortableComponentAddEvent extends ComponentEvent<SortableLayout> {

        private final List<Component> components;

        public SortableComponentAddEvent(SortableLayout source, boolean fromClient, List<Component> components) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        /**
         *
         * @return added component
         */
        public Component getComponent() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public List<Component> getComponents() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    public static class SortableComponentDeleteEvent extends ComponentEvent<SortableLayout> {

        private final List<Component> components;

        public SortableComponentDeleteEvent(SortableLayout source, boolean fromClient, List<Component> components) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        /**
         *
         * @return deleted component
         */
        public Component getComponent() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public List<Component> getComponents() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
    public static class SortableComponentReorderEvent extends ComponentEvent<SortableLayout> {

        private final List<Component> components;

        public SortableComponentReorderEvent(SortableLayout source, boolean fromClient, List<Component> components) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        /**
         *
         * @return reordered component
         */
        public Component getComponent() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public List<Component> getComponents() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    private static void replace(HasComponents layout, Component oldComponent, Component newComponent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Registration addChooseListener(ComponentEventListener<ChooseEvent> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Registration addUnchooseListener(ComponentEventListener<UnchooseEvent> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Registration addChangeListener(ComponentEventListener<ChangeEvent> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @DomEvent("on-choose")
    public static class ChooseEvent
            extends ComponentEvent<SortableLayout> {
        public ChooseEvent(SortableLayout source,
                           boolean fromClient) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    @DomEvent("on-unchoose")
    public static class UnchooseEvent
            extends ComponentEvent<SortableLayout> {
        public UnchooseEvent(SortableLayout source,
                             boolean fromClient) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    @DomEvent("on-change")
    public static class ChangeEvent
            extends ComponentEvent<SortableLayout> {
        public ChangeEvent(SortableLayout source,
                           boolean fromClient) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}