package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.component.renderers.SerializableRenderer;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.security.specific.UiFilterByDepartment2Enabled;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.RegionService;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.OpenMode;
import com.smartbox.jobster.view.filter.FilterView;
import com.smartbox.jobster.view.monitoring.loader.KanbanFilter;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.Query;
import com.vaadin.flow.data.renderer.TextRenderer;
import io.jmix.core.FileRef;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.core.MetadataTools;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.filter.FilterComponent;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.DataGridColumn;
import io.jmix.flowui.component.listbox.JmixMultiSelectListBox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.View;
import lombok.Data;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ComponentUtils {

    public static Notification notifyError(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Notification notifyWarning(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Notification notifySuccess(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static Notification notify(String message, NotificationVariant variant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String countryFlag(Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static TreeComboBox<Department> departmentTreeComboBox(HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<TreeComboBox<Department>, Department>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static TreeComboBox<Department> departmentTreeComboBox(HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<TreeComboBox<Department>, Department>> listener, boolean label) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static TreeComboBox<Region> regionTreeComboBox(HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<TreeComboBox<Region>, Region>> listener, boolean showLabel) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<Department> filterTopParents(List<Department> list) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static HorizontalLayout getFileLayout(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void setupFilterDialog(View<?> origin, SettingsFacet settings, GenericFilter genericFilter,
                                         JmixMultiSelectComboBox<Object> filter, Icon filterBtn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void updateFilterItems(GenericFilter genericFilter, JmixMultiSelectComboBox<Object> filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static View<?> findCurrentView() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static KanbanFilter findKanbanFilter(Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Icon makeStar(Color colorObj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static JmixRichTextEditor createRichTextEditor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static JmixTextArea createTextArea() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static HorizontalLayout createHbox(Component... components) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static VerticalLayout createVbox(Component... components) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static JmixButton createButton(boolean visible, VaadinIcon icon, ComponentEventListener<ClickEvent<Button>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static JmixButton createButton(boolean visible, VaadinIcon icon) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static JmixButton createButton(boolean visible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static HorizontalLayout coloredEnumRenderer(String text, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static JmixMultiSelectListBox<OpenMode> createOpenModeListBox(View<?> origin) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Persists the view settings the moment the user rearranges the grid - drags a column to a new
     * position, resizes it, sorts by it or hides it from the column visibility menu.
     * <p>
     * The settings facet writes the layout only on {@code DetachEvent}, and
     * {@code UserSettingsServiceImpl} skips that write once the Vaadin session is no longer OPEN, so
     * a redeploy, a session timeout or a plain logout used to throw the rearranged columns away.
     * <p>
     * Register this only after the stored layout has been restored. That is exactly why
     * {@code settings.saveSettings()} cannot be called from {@code onInit}: the facet applies the
     * stored settings at {@code ReadyEvent}, so an earlier save persists the default columns over the
     * user's own ones.
     */
    public static <T> void saveSettingsOnGridLayoutChange(Grid<T> grid, Runnable save) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public static Integer getAvatarColorIndex(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Div makeCircle(Color color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void animateComponent(String animationClassName, Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Data
    public static class Color {

        public static final Color RED = new Color("#FF0000");
        public static final Color BLUE = new Color("#0000FF");
        public static final Color GREEN = new Color("#00FF00");
        public static final Color PURPLE = new Color("#800080");
        public static final Color ORANGE = new Color("#FFA500");
        public static final Color PINK = new Color("#FFC0CB");
        public static final Color YELLOW = new Color("#FFCC00");
        public static final Color WHITE = new Color("#FFFFFF");
        public static final Color GRAY = new Color("#1C375A29");

        private final String color;

        private Color(String color) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public static Color of(String color) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }


    public static void writeGridToExcel(DataGrid<?> grid, OutputStream outputStream) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void writeGridToExcel(Grid<?> grid, OutputStream outputStream) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static void writeGridToExcelInternal(Grid<?> grid, OutputStream outputStream, Collection<?> items) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
