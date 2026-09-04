package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.cms.Comment;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.comment.CommentView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@FragmentDescriptor("person-comment-fragment.xml")
public class PersonCommentFragment extends Fragment<VerticalLayout> {
    private Comment comment;

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private UserService userService;

    @ViewComponent
    private VerticalLayout root;

    @ViewComponent
    private VerticalLayout commentBox;

    @ViewComponent
    private Avatar avatar;

    @ViewComponent
    private Paragraph commentOwnerName;

    @ViewComponent
    private Paragraph commentDate;

    @ViewComponent
    private Div commentDiv;

    /**
     * Batch-friendly variant: the host view resolves every comment owner in ONE query and passes
     * the map (user id → employee, value may be null). The plain variant costs one query per
     * rendered comment.
     */
    public void setComment(Comment comment, Map<UUID, Employee> ownersByUserId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setComment(Comment comment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, Employee> ownersByUserId;

    private void buildCommentsBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}