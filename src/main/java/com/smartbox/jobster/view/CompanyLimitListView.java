package com.smartbox.jobster.view;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyLimit;
import com.smartbox.jobster.view.company.companyemail.CompanyEmailListView;
import com.smartbox.jobster.view.company.sms.CompanySmsListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.action.SecuredBaseAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "company-limits", layout = MainView.class)
@ViewController(id = "jb_CompanyLimit.list")
@ViewDescriptor(path = "company-limit-list-view.xml")
@LookupComponent("companyLimitsDataGrid")
@DialogMode(width = "64em")
public class CompanyLimitListView extends StandardListView<CompanyLimit> {
    @Getter
    @Setter
    private Company company;

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<CompanyLimit> companyLimitsDc;
    @ViewComponent
    private InstanceContainer<CompanyLimit> companyLimitDc;
    @ViewComponent
    private InstanceLoader<CompanyLimit> companyLimitDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private DataGrid<CompanyLimit> companyLimitsDataGrid;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private CollectionLoader<CompanyLimit> companyLimitsDl;
    @ViewComponent
    private Paragraph companySmsLimit;
    @ViewComponent
    private Paragraph companyEmailLimit;

    @Autowired
    private Messages messages;
    @Autowired
    private DialogWindows dialogWindows;

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

    @Subscribe("companyLimitsDataGrid.create")
    public void onCompanyLimitsDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveButton")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelButton")
    public void onCancelButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "companyLimitsDc", target = Target.DATA_CONTAINER)
    public void onCompanyLimitsDcItemChange(final InstanceContainer.ItemChangeEvent<CompanyLimit> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(CompanyLimit entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewValidation getViewValidation() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("smsSettingsBtn")
    public void onSmsSettingsBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("emailSettingsBtn")
    public void onEmailSettingsBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
