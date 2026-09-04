package com.smartbox.jobster.view.zpcast.salaryinfo;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.event.ReloadListViewEvent;
import com.smartbox.jobster.service.zpcast.SalaryService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.zpcast.salarydata.SalaryDataListView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButtonItem;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;

import java.util.List;

@Route(value = "salaryInfo", layout = MainView.class)
@ViewController("jb_SalaryInfo.list")
@ViewDescriptor("salary-info-list-view.xml")
public class SalaryInfoListView extends AbstractListView<SalaryInfo> {


    @Autowired
    private Notifications notifications;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private SalaryService salaryService;
    @Autowired
    private Dialogs dialogs;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.data")
    public void onSalaryInfoDataGridData(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "comboBtn", subject = "clickListener")
    public void onComboBtnClick(final ClickEvent<?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("comboBtn.startEmail")
    public void onComboBtnStartEmailClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("comboBtn.startSms")
    public void onComboBtnStartSmsClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("comboBtn.startTelegram")
    public void onComboBtnStartTelegramClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @EventListener()
    public void reloadView(ReloadListViewEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendByTelegram() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}