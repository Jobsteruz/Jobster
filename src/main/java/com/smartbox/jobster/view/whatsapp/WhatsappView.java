package com.smartbox.jobster.view.whatsapp;


import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "whatsapp", layout = MainView.class)
@ViewController("jb_WhatsappView")
@ViewDescriptor("whatsapp-view.xml")
public class WhatsappView extends StandardView {
}