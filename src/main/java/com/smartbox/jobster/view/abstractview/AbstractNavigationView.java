package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.NavigationService;
import com.smartbox.jobster.service.TranslateService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.QueryParameters;
import io.jmix.core.Messages;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author Jobster team
 * Since: 6/4/2024 11:39 AM
 */

public abstract class AbstractNavigationView extends StandardView implements NavigationSupport {

    @Autowired
    public NavigationService navigationService;

    @Autowired
    protected EmployeeService employeeService;

    @Autowired
    protected Messages messages;

    @Autowired
    protected TranslateService translateService;

    @Getter
    @Setter
    protected Navigation navigation;

    @Override
    public @NonNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Navigation resolveNavigationFromUrl() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onNavigationQueryParametersChange(final View.QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
