package com.smartbox.jobster.view.website.section.vacancy;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.pebble.PageRenderConfig;
import com.smartbox.jobster.pebble.WebSiteExtension;
import com.smartbox.jobster.pojo.SimpleHierarchicOption;
import com.smartbox.jobster.pojo.Template;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.website.AbstractWebSection;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Route(value = "vacancy-page-view", layout = MainView.class)
@ViewController("jb_VacancyPageView")
@ViewDescriptor("vacancy-page-view.xml")
@CssImport("./webQur/vacancy-section.css")
public class VacancyPageView extends AbstractWebSection {
    private static final Gson GSON = new GsonBuilder().create();

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;

    @ViewComponent
    private Paragraph vacancyPageShortTitle;
    @ViewComponent
    private Paragraph vacancyPageTitle;
    @ViewComponent
    private VerticalLayout vacancyCardsBox;
    @ViewComponent
    private HorizontalLayout vacancyActionsBox;
    @ViewComponent
    private VerticalLayout vacancyPageContainer;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private TenantProvider tenantProvider;

    @Override
    public void buildSection(Section section, Page page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildVacancyCard(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public String buildPebble(Section section, PageRenderConfig config, int currentPage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "vacancyActionsBox", subject = "doubleClickListener")
    public void onVacancyActionsBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "vacancyPageContainer", subject = "doubleClickListener")
    public void onVacancyPageContainerClick1(final ClickEvent<VerticalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}