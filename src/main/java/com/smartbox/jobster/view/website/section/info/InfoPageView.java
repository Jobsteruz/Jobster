package com.smartbox.jobster.view.website.section.info;


import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.pebble.PageRenderConfig;
import com.smartbox.jobster.pebble.WebSiteExtension;
import com.smartbox.jobster.pojo.Template;
import com.smartbox.jobster.service.TemplatesService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.website.AbstractWebSection;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Route(value = "info-page-view", layout = MainView.class)
@ViewController("jb_InfoPageView")
@ViewDescriptor("info-page-view.xml")
@CssImport("./webQur/info-section.css")
public class InfoPageView extends AbstractWebSection {

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;

    @ViewComponent
    private Paragraph infoShortTitle;
    @ViewComponent
    private Paragraph infoTitle;
    @ViewComponent
    private Div infoContent;
    @ViewComponent
    private HorizontalLayout infoActionsBox;
    @ViewComponent
    private VerticalLayout infoPageContainer;

    @Override
    public void buildSection(Section section, Page page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String buildPebble(Section section, PageRenderConfig config, int currentPage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout buildCard(String title, String desc) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "infoActionsBox", subject = "doubleClickListener")
    public void onInfoActionsBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "infoLineBox", subject = "doubleClickListener")
    public void onInfoLineBoxClick(final ClickEvent<VerticalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}