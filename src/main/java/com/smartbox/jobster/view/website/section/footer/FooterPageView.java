package com.smartbox.jobster.view.website.section.footer;


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
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Route(value = "footer-page-view", layout = MainView.class)
@ViewController("jb_FooterPageView")
@ViewDescriptor("footer-page-view.xml")
@CssImport("./webQur/footer.css")
public class FooterPageView extends AbstractWebSection {

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private UiComponents uiComponents;

    @ViewComponent
    private JmixImage<FileRef> logo;
    @ViewComponent
    private Paragraph info;
    @ViewComponent
    private Paragraph copyRight;
    @ViewComponent
    private VerticalLayout pages;
    @ViewComponent
    private VerticalLayout contact;
    @ViewComponent
    private HorizontalLayout footerActionsBox;
    @ViewComponent
    private VerticalLayout footerPageContainer;

    @Override
    public void buildSection(Section section, Page page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildNavigationBox(JSONObject json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildContactBox(JSONObject json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String buildPebble(Section section, PageRenderConfig config, int currentPage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "footerActionsBox", subject = "doubleClickListener")
    public void onFooterActionsBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "footerBox", subject = "doubleClickListener")
    public void onFooterBoxClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}