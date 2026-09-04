package com.smartbox.jobster.view.website.section.navigation;


import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.entity.web.SectionFile;
import com.smartbox.jobster.pebble.PageRenderConfig;
import com.smartbox.jobster.pebble.WebSiteExtension;
import com.smartbox.jobster.pojo.Template;
import com.smartbox.jobster.service.TemplatesService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.website.AbstractWebSection;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.view.*;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

@Route(value = "navigation-page-view", layout = MainView.class)
@ViewController("jb_NavigationPageView")
@ViewDescriptor("navigation-page-view.xml")
@CssImport("./webQur/navigation-section.css")
public class NavigationPageView extends AbstractWebSection {

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @ViewComponent
    private JmixImage<FileRef> navImg;
    @ViewComponent
    private HorizontalLayout navActionBox;
    @ViewComponent
    private HorizontalLayout navActionsBox;
    @ViewComponent
    private VerticalLayout webNavLayout;


    @Override
    public void buildSection(Section section, Page page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildActions(JSONObject jsonObject) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildLangBox(JSONObject jsonObject) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String buildPebble(Section section, PageRenderConfig config, int currentPage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "navActionsBox", subject = "doubleClickListener")
    public void onNavActionsBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "navPageBox", subject = "doubleClickListener")
    public void onNavPageBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}