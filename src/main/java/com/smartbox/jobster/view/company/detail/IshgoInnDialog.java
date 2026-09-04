package com.smartbox.jobster.view.company.detail;

import com.smartbox.jobster.entity.company.CompanyDetail;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;

/**
 * Dialog to set the IshGO company name + logo for a single INN slot (1, 2 or 3)
 * on a {@link CompanyDetail}. The values are written back to the passed entity
 * instance in-memory; the parent detail view persists them on its own save.
 */
@Route(value = "ishgo-inn-dialog", layout = MainView.class)
@ViewController(id = "jb_IshgoInnDialog")
@ViewDescriptor(path = "ishgo-inn-dialog.xml")
@DialogMode(width = "25em", height = "AUTO")
public class IshgoInnDialog extends StandardView {

    private CompanyDetail companyDetail;
    private int slot;

    @ViewComponent
    private Span innLabel;
    @ViewComponent
    private TypedTextField<String> nameField;
    @ViewComponent
    private FileStorageUploadField logoField;
    @ViewComponent
    private MessageBundle messageBundle;

    public void setData(CompanyDetail companyDetail, int slot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void fill(String inn, String name, FileRef logo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String label(String inn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
