package com.smartbox.jobster.view.orgchart;

import com.flowingcode.vaadin.addons.orgchart.OrgChart;
import com.flowingcode.vaadin.addons.orgchart.OrgChartItem;
import com.flowingcode.vaadin.addons.orgchart.extra.TemplateLiteralRewriter;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import io.jmix.core.Messages;
import io.jmix.core.MetadataTools;
import io.jmix.core.security.CurrentAuthentication;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author Jobster team
 * Date: 11/14/2023 3:02 PM
 */

public class OrgChartBuilder {
    protected int id;
    protected OrgChart orgChart;
    protected Department department;
    private final Messages messages;
    private final MetadataTools metadataTools;
    private final EmployeeService employeeService;
    private final TranslateService translateService;
    private final List<Div> actBtnsList;
    private final String locale;
    private final Environment environment;
    private final String empl;
    private final String vacancies;
    private final String actEmp;
    private final String branchName;
    private final String departmentName;
    private final String empPln;
    private final String regionName;
    private final String categoryName;

    private Function<Department, Void> removeFunction;
    private Function<Department, Void> editFunction;
    private Function<Department, Void> addFunction;
    private Function<Department, Void> request;
    private Function<Department, Void> cloneFunction;

    public OrgChartBuilder(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OrgChartBuilder withRemoveFunction(Function<Department, Void> function) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OrgChartBuilder withEditFunction(Function<Department, Void> function) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OrgChartBuilder withAddFunction(Function<Department, Void> function) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OrgChartBuilder withRequestFunction(Function<Department, Void> function) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OrgChartBuilder withCloneFunction(Function<Department, Void> function) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OrgChart build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setNodeTemplate(OrgChart orgChart) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private OrgChartItem chartItem(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String itemName(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setItemData(OrgChartItem chartItem, Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String makeImgData(StaffingTable staffingTable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String makeImgData(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String makeData(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String firstChar(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeActionButtons(OrgChartItem chartItem, Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div actionButton(String id, String text, Icon icon, ComponentEventListener<ClickEvent<Div>> clickListener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
