package com.smartbox.jobster.view.company.config;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.CompanyConfig;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.componentfactory.ToggleButton;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.multiselectcomboboxpicker.JmixMultiSelectComboBoxPicker;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "companyConfigs/:id", layout = MainView.class)
@ViewController("jb_CompanyConfig.detail")
@ViewDescriptor("company-config-detail-view.xml")
@EditedEntityContainer("companyConfigDc")
@DialogMode(width = "40em", height = "AUTO", closeOnEsc = true)
public class CompanyConfigDetailView extends AbstractDetailView<CompanyConfig> {

    @ViewComponent
    private HorizontalLayout enable2stepBox;
    @ViewComponent
    private HorizontalLayout default2stepBox;
    @ViewComponent
    private JmixMultiSelectComboBox<Platform> default2step;
    @ViewComponent
    private HorizontalLayout template2stepBox;
    @ViewComponent
    private HorizontalLayout offerPositionBox;
    @ViewComponent
    private HorizontalLayout selectVacancyBox;
    @ViewComponent
    private HorizontalLayout autoCreateVacancyBox;
    @ViewComponent
    private HorizontalLayout createBranchOnCloneBox;
    @ViewComponent
    private HorizontalLayout additionalQuestionsJ3Box;
    @ViewComponent
    private HorizontalLayout twoStepApprovalBox;
    @ViewComponent
    private EntityComboBox<RoleType> approverRoleTypeField;
    @ViewComponent
    private EntityComboBox<DepartmentCategory> approvalCategoryField;
    @ViewComponent
    private HorizontalLayout notifyRespBox;
    @ViewComponent
    private JmixCheckboxGroup<Platform> platforms;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private CollectionLoader<AutoFillTemplate> autofillTempsDl;
    @ViewComponent
    private CollectionLoader<RoleType> roleTypesDl;
    @ViewComponent
    private CollectionLoader<DepartmentCategory> departmentCategoriesDl;
    @ViewComponent
    private RichTextEditor templatePreview;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> templateField;
    @ViewComponent
    private JmixMultiSelectComboBoxPicker<DepartmentCategory> autoCreateVacancyOnCategoriesField;

    @Autowired
    private CompanyService companyService;
    @Autowired
    private LanguageService languageService;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initEnable2stepBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initOfferPositionBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initSelectVacancyBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initAutoCreateVacancyBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initCreateBranchOnCloneBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initAdditionalQuestionsJ3Box() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initTwoStepApprovalBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initNotifyRespBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("templateField")
    public void onTemplateFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<AutoFillTemplate>, AutoFillTemplate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}