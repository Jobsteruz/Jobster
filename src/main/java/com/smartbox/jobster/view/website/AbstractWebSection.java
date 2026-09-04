package com.smartbox.jobster.view.website;

import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.vaadin.flow.component.ClickEvent;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.Subscribe;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jobster team
 * Since: 8/13/2024 2:24 PM
 */
@Getter
@Setter
public abstract class AbstractWebSection extends StandardView implements WebSectionInterface {
    protected Page page;
    protected Section section;

    @Autowired
    protected Dialogs dialogs;
    @Autowired
    protected Messages messages;
    @Autowired
    protected DataManager dataManager;

    @Override
    public void buildSection(Section section, Page page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "trashBtn", subject = "clickListener")
    public void onTrashBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
