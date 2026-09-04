package com.smartbox.jobster.config;

import com.smartbox.jobster.component.AppListMenu;
import com.smartbox.jobster.component.JbJpqlFilter;
import com.smartbox.jobster.component.JbPropertyFilter;
import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.component.code.CodeFieldLoader;
import com.smartbox.jobster.component.composite.ChatComponent;
import com.smartbox.jobster.component.composite.ChatComponentLoader;
import com.smartbox.jobster.component.datepicker.JobsterDatePicker;
import com.smartbox.jobster.component.datepicker.JobsterDateTimePicker;
import com.smartbox.jobster.component.translation.*;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.datetimepicker.TypedDateTimePicker;
import io.jmix.flowui.component.jpqlfilter.JpqlFilter;
import io.jmix.flowui.component.main.JmixListMenu;
import io.jmix.flowui.component.propertyfilter.PropertyFilter;
import io.jmix.flowui.sys.registration.ComponentRegistration;
import io.jmix.flowui.sys.registration.ComponentRegistrationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public ComponentRegistration appListMenu() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration jpqlFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration propertyFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration chatComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration translateField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration translateAreaField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration translateRichTextEditor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ComponentRegistration codeField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Replaces the standard date picker so the calendar always starts the week on Monday
     * (see {@link JobsterDatePicker}).
     */
    @Bean
    public ComponentRegistration jobsterDatePicker() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Replaces the standard date-time picker so the embedded calendar always starts the week on Monday
     * (see {@link JobsterDateTimePicker}).
     */
    @Bean
    public ComponentRegistration jobsterDateTimePicker() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
