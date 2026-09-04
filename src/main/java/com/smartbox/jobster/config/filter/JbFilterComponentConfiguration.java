package com.smartbox.jobster.config.filter;

import io.jmix.flowui.component.genericfilter.registration.FilterComponentRegistration;
import io.jmix.flowui.component.genericfilter.registration.FilterComponentRegistrationBuilder;
import io.jmix.flowui.component.jpqlfilter.JpqlFilter;
import io.jmix.flowui.entity.filter.JpqlFilterCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Overrides Jmix's default {@code flowui_JpqlFilterRegistration} with our
 * {@link JbJpqlFilterConverter}, which pre-populates EntityComboBox items for
 * questionnaire conditions before {@code setValue} is called on restored filters.
 * <p>
 * {@code @Order(HIGHEST_PRECEDENCE)} ensures our registration is processed before the
 * stock one — {@code FilterComponents} gives priority to the highest-precedence registration
 * for a given filter component class.
 */
@Configuration
public class JbFilterComponentConfiguration {

    @Bean("jb_JpqlFilterRegistration")
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public FilterComponentRegistration registerJbJpqlFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
