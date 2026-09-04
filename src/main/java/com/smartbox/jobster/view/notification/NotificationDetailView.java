package com.smartbox.jobster.view.notification;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.EntityStates;
import io.jmix.core.Metadata;
import io.jmix.flowui.component.multiselectcomboboxpicker.JmixMultiSelectComboBoxPicker;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.security.role.ResourceRoleRepository;
import io.jmix.security.model.ResourceRoleModel;
import io.jmix.security.model.RoleModelConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Route(value = "notifications/:id", layout = MainView.class)
@ViewController("jb_Notification.detail")
@ViewDescriptor("notification-detail-view.xml")
@EditedEntityContainer("notificationDc")
public class NotificationDetailView extends AbstractDetailView<Notification> {

    @ViewComponent
    private JmixRadioButtonGroup<NotificationType> mainNotifyType;
    @ViewComponent
    private JmixRadioButtonGroup<NotificationType> notifyType;
    @ViewComponent
    private JmixMultiSelectComboBoxPicker notifyTo;
    @ViewComponent
    private RichTextEditor notificationMessageField;
    @ViewComponent
    private FileStorageUploadField photoField;
    @ViewComponent
    private JmixButton saveBtn;

    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private EntityService entityService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private ResourceRoleRepository roleRepository;
    @Autowired
    private RoleModelConverter roleModelConverter;
    @Autowired
    private RoleService roleService;
    @Autowired
    private Metadata metadata;
    @Autowired
    private UserService userService;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildUserRoleBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("mainNotifyType")
    public void onMainNotifyTypeComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixRadioButtonGroup<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}