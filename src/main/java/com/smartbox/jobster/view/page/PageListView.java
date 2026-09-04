package com.smartbox.jobster.view.page;

import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "pages", layout = MainView.class)
@ViewController("jb_Page.list")
@ViewDescriptor("page-list-view.xml")
@LookupComponent("pagesDataGrid")
@DialogMode(width = "64em")
public class PageListView extends StandardListView<Page> {
}