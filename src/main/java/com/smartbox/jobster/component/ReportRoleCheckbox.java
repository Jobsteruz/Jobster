package com.smartbox.jobster.component;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.vaadin.flow.component.checkbox.Checkbox;
import io.jmix.core.InstanceNameProvider;
import lombok.Getter;
import lombok.Setter;

public class ReportRoleCheckbox extends Checkbox {
    private final InstanceNameProvider instanceNameProvider = AppBeans.get(InstanceNameProvider.class);
    @Getter
    @Setter
    private RoleType roleType;
    @Setter
    private boolean defaultValue;

    public ReportRoleCheckbox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ReportRoleCheckbox(RoleType roleType, boolean defaultValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
