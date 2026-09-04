package com.smartbox.jobster.view.schedule.timepickerfragment;

import com.smartbox.jobster.entity.WeekDay;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.timepicker.TimePicker;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@FragmentDescriptor("timepicker-fragment.xml")
public class TimepickerFragment extends Fragment<HorizontalLayout> {
    private WeekDay day;

    @ViewComponent
    private TimePicker timePicker;

    @Subscribe(id = "deleteButton", subject = "clickListener")
    public void onDeleteButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}