package com.smartbox.jobster.view.superset.superset;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.superset.SupersetReportView;
import com.smartbox.jobster.service.SupersetReportService;
import com.smartbox.jobster.service.superset.SupersetTokenService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.multitenancy.core.TenantProvider;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "superset-view", layout = MainView.class)
@ViewController(id = "jb_SupersetView")
@ViewDescriptor(path = "superset-view.xml")
public class SupersetView extends AbstractNavigationView {

    /** Query param name for selecting a Superset dashboard via {@code SupersetReportView.crcId}. */
    private static final String PARAM_SID = "sid";
    /** Query param name for passing a Superset dashboard id directly (legacy / direct routing). */
    private static final String PARAM_DASHBOARD_ID = "dashboardId";

    @ViewComponent
    private Div dashboardContainer;
    @Autowired
    private SupersetTokenService supersetTokenService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private SupersetReportService supersetReportService;

    private String paramDashboardId;
    private String paramSid;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onSupersetQueryParametersChange(final View.QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initSupersetDashboard(String token, String dashboardId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
