package com.smartbox.jobster.view.vacancy.lookup;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.security.specific.UiFilterByDepartment2Enabled;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

import java.util.List;
import java.util.UUID;


@Route(value = "lookupVacancies", layout = MainView.class)
@ViewController(id = "jb_VacancyLookup.list")
@ViewDescriptor(path = "vacancy-lookup-view.xml")
public class VacancyLookupView extends AbstractListView<Vacancy> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
