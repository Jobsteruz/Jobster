package com.smartbox.jobster.view.zpcast.templates;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.config.validator.JsonValidator;
import com.smartbox.jobster.entity.zpcast.Template;
import com.smartbox.jobster.entity.zpcast.TemplateField;
import com.smartbox.jobster.service.SequenceService;
import com.smartbox.jobster.service.zpcast.TemplateFieldService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.zpcast.templatefield.fieldsimport.FieldsImportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.GridSortOrder;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.provider.SortDirection;
import com.vaadin.flow.router.Route;
import io.jmix.core.Sort;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.inputdialog.InputDialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputDialog;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.codeeditor.CodeEditor;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.codeeditor.CodeEditorMode;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButtonItem;
import io.jmix.flowui.model.CollectionPropertyContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.model.Sorter;
import io.jmix.flowui.view.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Route(value = "templates/:id", layout = MainView.class)
@ViewController("jb_Template.detail")
@ViewDescriptor("template-detail-view.xml")
@EditedEntityContainer("templateDc")
public class TemplateDetailView extends AbstractDetailView<Template> {

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private InstanceContainer<Template> templateDc;
    @ViewComponent
    private CollectionPropertyContainer<TemplateField> fieldsDc;
    @ViewComponent
    private DataGrid<TemplateField> fieldsDataGrid;

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private SequenceService sequenceService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Notifications notifications;
    @Autowired
    private TemplateFieldService templateService;
    @ViewComponent
    private HorizontalLayout moveBtn;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "fieldsDataGrid.create", subject = "afterSaveHandler")
    private void fieldsDataGridCreateAfterSaveHandler(final TemplateField templateField) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "fieldsDataGrid.edit", subject = "afterSaveHandler")
    private void fieldsDataGridEditAfterSaveHandler(final TemplateField templateField) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fieldsDataGrid.importXls")
    public void onFieldsDataGridImportXls(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "moveDownBtn", subject = "clickListener")
    public void onMoveDownBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "moveUpBtn", subject = "clickListener")
    public void onMoveUpBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("dropdownButton.downloadItem")
    public void onDropdownButtonDownloadItemClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("dropdownButton.uploadItem")
    public void onDropdownButtonUploadItemClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void importFieldsFromJsonArray(String jsonArray, Template template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<TemplateField> readTemplateFieldsFromJson(String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void copyToClipBoard(CodeEditor textArea) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sort() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}