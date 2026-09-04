package com.smartbox.jobster.view.manual_attendance;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.EmptyLabel;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.entity.vision.ManualAttendRestDay;
import com.smartbox.jobster.entity.vision.ManualAttendance;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.attendance.ManualAttendLockService;
import com.smartbox.jobster.service.attendance.ManualAttendService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.abstractview.ViewParam;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.view.ViewController;
import org.apache.commons.lang3.math.NumberUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Jobster team
 * date: 14/08/24 13:11
 */

@ViewController
abstract class AbstractAttendSupport extends AbstractNavigationView {
    protected static final String TMP_COLUMN = "tmp-column-";

    @Autowired
    protected Messages messages;
    @Autowired
    protected DataManager dataManager;
    @Autowired
    protected DialogWindows dialogWindows;
    @Autowired
    protected EntityStates entityStates;
    @Autowired
    protected UiComponents uiComponents;
    @Autowired
    protected InstanceNameProvider instanceNameProvider;


    @Autowired
    protected EntityService entityService;
    @Autowired
    protected EmployeeService employeeService;
    @Autowired
    protected UserService userService;
    @Autowired
    protected ManualAttendService attendService;
    @Autowired
    protected ManualAttendLockService lockService;

    protected ViewContext viewContext;


    protected abstract void build();
    protected abstract ManualAttendConfig getAttendConfig(Department department);
    protected abstract void refreshEmployeeRow(EmployeeDto employeeDto);
    protected abstract ManualAttendRestDay getRestDay(ManualAttendConfig attendConfig, LocalDate day);
    protected abstract ManualAbsentReason getAbsentReason(String code);
    protected abstract Collection<EmployeeDto> loadAttendances(Department parent);


    @Override
    public void onNavigationQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected ComponentRenderer<Component, EmployeeDto> readOnlyRenderer(LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ComponentRenderer<Component, EmployeeDto> restDayRenderer(ManualAttendRestDay restDay, LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ComponentRenderer<Component, EmployeeDto> editableCellRenderer(LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected @NotNull ManualAttendance makeManualAttendance(LocalDate day, Employee employee, Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected static @Nullable String extractAttendText(ManualAttendance attendance) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public List<ViewParam> navViewParams() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void initViewContext() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
