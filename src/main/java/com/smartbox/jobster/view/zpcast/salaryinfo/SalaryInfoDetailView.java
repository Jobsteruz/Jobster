package com.smartbox.jobster.view.zpcast.salaryinfo;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.zpcast.EmployeeInsertType;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.entity.zpcast.Template;
import com.smartbox.jobster.event.ReloadListViewEvent;
import com.smartbox.jobster.service.FileService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.zpcast.SalaryService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.TimeSource;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiEventPublisher;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.upload.JmixUpload;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@Route(value = "salaryInfoes/:id", layout = MainView.class)
@ViewController("jb_SalaryInfo.detail")
@ViewDescriptor("salary-info-detail-view.xml")
@EditedEntityContainer("salaryInfoDc")
@DialogMode(width = "48em", height = "AUTO")
public class SalaryInfoDetailView extends AbstractDetailView<SalaryInfo> {
    private static final Logger log = LoggerFactory.getLogger(SalaryInfoDetailView.class);

    @Autowired
    private TimeSource timeSource;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private SalaryService salaryService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private FileService fileService;
    @Autowired
    private Dialogs dialogs;

    @ViewComponent
    private CollectionLoader<Template> templateDl;
    @ViewComponent
    private CollectionLoader<RoleType> roleTypeDl;
    @ViewComponent
    private JmixRadioButtonGroup<EmployeeInsertType> insertType;
    @ViewComponent
    private EntityComboBox<RoleType> roleField;
    @ViewComponent
    private JmixComboBox<Integer> monthField;
    @ViewComponent
    private JmixComboBox<Integer> yearField;
    @ViewComponent
    private JmixUpload upload;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<SalaryInfo> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SalaryInfo findEntity() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void parseExcel(SalaryInfo salaryInfo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private class ImportTask extends BackgroundTask<Integer, Long> {
        List<Map<String, String>> list;
        EmployeeInsertType insertType;
        SalaryInfo salaryInfo;
        String tenantId;
        RoleType roleType;

        public ImportTask(SalaryInfo salaryInfo, List<Map<String, String>> list, EmployeeInsertType insertType, RoleType roleType, String tenantId) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public Long run(@NotNull TaskLifeCycle taskLifeCycle) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public void done(Long result) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}