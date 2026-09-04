package com.smartbox.jobster.view.main;

import com.smartbox.jobster.service.CompanyService;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

@FragmentDescriptor("payment-overdue-fragment.xml")
public class PaymentOverdueFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private Paragraph monthsLabel;

    @Autowired
    private CompanyService companyService;
    @Autowired
    private Messages messages;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
