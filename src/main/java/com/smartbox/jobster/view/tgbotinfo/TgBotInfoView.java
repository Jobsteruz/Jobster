package com.smartbox.jobster.view.tgbotinfo;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.codeeditor.CodeEditor;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import kong.unirest.*;

@Route(value = "tg-bot-info-view", layout = MainView.class)
@ViewController(id = "jb_TgBotInfoView")
@ViewDescriptor(path = "tg-bot-info-view.xml")
public class TgBotInfoView extends StandardView {

    @ViewComponent
    private TypedTextField<Object> botToken;
    @ViewComponent
    private CodeEditor jsonEditor;

    @Subscribe(id = "getInfoBtn", subject = "clickListener")
    public void onGetInfoBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}