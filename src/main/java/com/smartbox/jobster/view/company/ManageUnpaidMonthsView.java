package com.smartbox.jobster.view.company;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

@Route(value = "manage-unpaid-months", layout = MainView.class)
@ViewController("jb_ManageUnpaidMonthsView")
@ViewDescriptor("manage-unpaid-months-view.xml")
@DialogMode(width = "40em")
public class ManageUnpaidMonthsView extends StandardView {

    @ViewComponent
    private H4 header;
    @ViewComponent
    private Span companiesInfo;
    @ViewComponent
    private JmixMultiSelectComboBox<Month> monthsField;
    @ViewComponent
    private JmixButton applyBtn;
    @ViewComponent
    private JmixButton clearAllBtn;
    @ViewComponent
    private JmixButton cancelBtn;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;

    private List<Company> companies = Collections.emptyList();

    public void setCompanies(List<Company> companies) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void refreshUi() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "applyBtn", subject = "clickListener")
    public void onApplyBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "clearAllBtn", subject = "clickListener")
    public void onClearAllBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
