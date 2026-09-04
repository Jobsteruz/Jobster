package com.smartbox.jobster.view.website;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.entity.web.Website;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.page.PageDetailView;
import com.smartbox.jobster.view.website.section.about.AboutTempView;
import com.smartbox.jobster.view.website.section.footer.FooterTempView;
import com.smartbox.jobster.view.website.section.info.InfoTempView;
import com.smartbox.jobster.view.website.section.navigation.NavigationTempView;
import com.smartbox.jobster.view.website.section.vacancy.VacancyTempView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dnd.DropEffect;
import com.vaadin.flow.component.dnd.DropTarget;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.codeeditor.CodeEditor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Route(value = "web-builder-view/:id", layout = MainView.class)
@ViewController("jb_WebBuilderView")
@ViewDescriptor("web-builder-view.xml")
public class WebBuilderView extends StandardView {
    private Website webSite;
    private Page firstPage;
    private VerticalLayout drawArea;

    @Value("${app.url}")
    private String appUrl;

    @ViewComponent
    private HorizontalLayout container;
    @ViewComponent
    private VerticalLayout sectionCards;
    @ViewComponent
    private VerticalLayout pages;
    @ViewComponent
    private CodeEditor codeEditor;
    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private WebSiteService webSiteService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildSectionCards() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildDropBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openSectionPage(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildWebPages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "configSaveBtn", subject = "clickListener")
    public void onConfigSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildPagesTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildPage(Page page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "viewSite", subject = "clickListener")
    public void onViewSiteClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}