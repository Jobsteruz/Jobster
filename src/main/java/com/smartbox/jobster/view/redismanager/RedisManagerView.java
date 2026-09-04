package com.smartbox.jobster.view.redismanager;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.service.GeneralCacheManagerService;
import com.smartbox.jobster.service.VerificationService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static com.smartbox.jobster.config.caching.RedisCacheNames.AVAILABLE_CACHES;
import static io.jmix.flowui.app.inputdialog.InputParameter.stringParameter;

@Route(value = "RedisManagerView", layout = MainView.class)
@ViewController("jb_RedisManagerView")
@ViewDescriptor("redis-manager-view.xml")
public class RedisManagerView extends AbstractNavigationView {
    public static final String AVAILABLE_CACHE_MANAGER = "availableCacheManager";
    private Map<String, Collection<String>> cacheNames;
    private String previousValue;

    @Autowired
    private Dialogs dialogs;
    @Autowired
    protected DataManager dataManager;
    @Autowired
    private GeneralCacheManagerService generalCacheManagerService;
    @Autowired
    private VerificationService verificationService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private KeyValueCollectionContainer cachesDc;
    @ViewComponent
    private JmixSelect<String> cacheManagersSelect;
    @ViewComponent
    private DataGrid<KeyValueEntity> cachesDataGrid;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cacheManagersSelect")
    public void onCacheManagersSelectComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void populateAvailableCaches() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadCacheManagerCaches(String cacheManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cachesDataGrid.clear")
    public void onCachesDataGridClear(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clearCache(Collection<KeyValueEntity> entities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "flushBtn", subject = "clickListener")
    public void onFlushBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}