package com.smartbox.jobster.view.user.management;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.user.UserNotificationService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.core.Messages;
import io.jmix.core.TimeSource;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.textfield.JmixEmailField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import io.jmix.securityflowui.password.PasswordValidationContext;
import io.jmix.securityflowui.password.PasswordValidationException;
import io.jmix.securityflowui.password.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;

@Route(value = "user-management/:id", layout = MainView.class)
@ViewController("jb_UserManagement.detail")
@ViewDescriptor("user-management-detail-view.xml")
@EditedEntityContainer("userDc")
public class UserManagementDetailView extends AbstractDetailView<User> {

    @ViewComponent
    private DataContext dataContext;

    @ViewComponent
    private TypedTextField<String> firstNameField;
    @ViewComponent
    private TypedTextField<String> lastNameField;
    @ViewComponent
    private TypedTextField<String> usernameField;
    @ViewComponent
    private JmixEmailField emailField;
    @ViewComponent
    private PasswordField passwordField;
    @ViewComponent
    private PasswordField confirmPasswordField;
    @ViewComponent
    private TypedTextField<String> phoneField;
    @ViewComponent
    private VerticalLayout positionContainer;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private EntityComboBox<RoleType> roleTypeField;

    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionContainer<Position> positionDc;
    @ViewComponent
    private HorizontalLayout departmentBox;
    @ViewComponent
    private Button deptLookupBtn;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserNotificationService userNotificationService;
    @Autowired
    private Messages messages;
    @Autowired
    private PasswordValidator<User> passwordValidator;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private DialogWindows dialogWindows;

    private TreeComboBox<Department> departmentTreeComboBox;
    private Employee employee;
    private StaffingTable staffingTable;
    @ViewComponent
    private JmixCheckbox isSetDepartmentHead;

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDepartmentComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openDepartmentLookup() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updatePositionItems(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onValidation(ValidationEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isEmailExists(String email) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
