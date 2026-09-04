package com.smartbox.jobster.view.action.mass.vacancy;


import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "request-approve-action-view", layout = MainView.class)
@ViewController(id = "jb_RequestApproveActionView")
@ViewDescriptor(path = "request-approve-action-view.xml")
public class RequestApproveActionView extends StandardView {
}