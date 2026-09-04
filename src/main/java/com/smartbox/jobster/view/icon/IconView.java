package com.smartbox.jobster.view.icon;


import com.smartbox.jobster.$;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.scroller.JmixScroller;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.stream.Collectors;

@Route(value = "IconView", layout = MainView.class)
@ViewController("jb_IconView")
@ViewDescriptor("icon-view.xml")
@DialogMode(width = "40em", height = "40em")
public class IconView extends StandardView {
    @Getter
    @Setter
    public String selectedIcon;

    @ViewComponent
    private JmixButton selectBtn;
    @ViewComponent
    private FlexLayout flexLayout;
    @ViewComponent
    private ProgressBar progressBar;
    @ViewComponent
    private JmixScroller scroller;
    @ViewComponent
    private TypedTextField<String> searchField;
    @ViewComponent
    private NativeLabel emptyLabel;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div createIcon(VaadinIcon vaadinIcon) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "selectBtn", subject = "clickListener")
    public void onSelectBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}