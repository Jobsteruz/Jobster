package com.smartbox.jobster.view.zpcast.salarydata;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.zpcast.SalaryService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.zpcast.salaryinfo.SendByEmailTask;
import com.smartbox.jobster.view.zpcast.salaryinfo.SendBySmsTask;
import com.smartbox.jobster.view.zpcast.salaryinfo.SendByTelegramTask;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Route(value = "salaryDatas", layout = MainView.class)
@ViewController("jb_SalaryData.list")
@ViewDescriptor("salary-data-list-view.xml")
public class SalaryDataListView extends AbstractListView<SalaryData> {


    private SalaryInfo salaryInfo;

    @Autowired
    private EntityService entityService;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private SalaryService salaryService;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.sendTelegram")
    public void onSalaryDataDataGridSendTelegram(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.sendSms")
    public void onSalaryDataDataGridSendSms(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.sendEmail")
    public void onSalaryDataDataGridSendEmail(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}