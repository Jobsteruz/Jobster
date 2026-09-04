package com.smartbox.jobster.view.website.section.about;


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
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.pebbletemplates.pebble.PebbleEngine;
import io.pebbletemplates.pebble.loader.StringLoader;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@Route(value = "about-page-view", layout = MainView.class)
@ViewController("jb_AboutPageView")
@ViewDescriptor("about-page-view.xml")
@CssImport("./webQur/about-section.css")
public class AboutPageView extends AbstractWebSection {

    @Autowired
    private DialogWindows dialogWindows;

    @ViewComponent
    private Paragraph aboutTitle;
    @ViewComponent
    private Paragraph aboutShortTitle;
    @ViewComponent
    private Paragraph aboutInfo;
    @ViewComponent
    private JmixButton aboutMoreBtn;
    @ViewComponent
    private JmixImage<Object> aboutImage;
    @ViewComponent
    private HorizontalLayout aboutActionsBox;
    @ViewComponent
    private VerticalLayout aboutPageContainer;

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

    @Subscribe(id = "aboutActionsBox", subject = "doubleClickListener")
    public void onAboutActionsBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "aboutPageBox", subject = "doubleClickListener")
    public void onAboutPageBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}