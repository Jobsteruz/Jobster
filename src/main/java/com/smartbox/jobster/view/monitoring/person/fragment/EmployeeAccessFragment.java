package com.smartbox.jobster.view.monitoring.person.fragment;

import com.google.common.base.Strings;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmployeeState;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.user.EmployeeUserListView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.textfield.JmixPasswordField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.password.PasswordValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@FragmentDescriptor("employee-access-fragment.xml")
public class EmployeeAccessFragment extends Fragment<VerticalLayout> {
    private static final String EMPTY = "------";

    private String locale;
    private Employee employee;
    private User tempUser;
    private final SaveContext context = new SaveContext();

    @ViewComponent
    private CollectionLoader<User> userDl;
    @ViewComponent
    private CollectionLoader<RoleType> roleTypeDl;
    @ViewComponent
    private JmixCheckbox accessField;
    @ViewComponent
    private VerticalLayout accessWrapper;
    @ViewComponent
    private Span user;
    @ViewComponent
    private Span roleType;
    @ViewComponent
    private Span default2step;
    @ViewComponent
    private VerticalLayout editAccessWrapper;
    @ViewComponent
    private EntityComboBox<User> userField;
    @ViewComponent
    private EntityComboBox<RoleType> roleTypeField;
    @ViewComponent
    private JmixMultiSelectComboBox<Platform> default2stepField;
    @ViewComponent
    private JmixButton editBtn;

    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private EntityService entityService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private PasswordValidation passwordValidation;
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @ViewComponent
    private JmixPasswordField passwordField;
    @ViewComponent
    private JmixPasswordField passwordConfirmField;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private RoleService roleService;
    @Autowired
    private SessionRegistry sessionRegistry;

    public void setEmployee(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "userField.entityLookup", subject = "viewConfigurer")
    private void userFieldEntityLookupViewConfigurer(final View<?> view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void onAccessFieldComponentValueChange() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void invalidateUserSessions(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void syncStateWithAccess(boolean accessed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void enableControls(boolean enabled) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("userField.generateUser")
    public void onUserFieldGenerateUser(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("userField")
    public void onUserFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<User>, User> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean validatePassword(String password, String confirmPassword, UserDetails user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildWrapper() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildEditWrapper() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}