package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.dto.callAgent.AiCallDataDto;
import com.smartbox.jobster.dto.callAgent.AiCallQAData;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.service.ai.AiCallDataService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.FileRef;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@FragmentDescriptor("person-calls-fragment.xml")
public class PersonCallsFragment extends Fragment<VerticalLayout> {

    private static final Logger log = LoggerFactory.getLogger(PersonCallsFragment.class);
    @Autowired
    private AiCallDataService aiCallDataService;
    @Autowired
    private Messages messages;
    @Autowired
    private Dialogs dialogs;

    @ViewComponent
    private H4 nameLabel;
    @ViewComponent
    private Span roleLabel;
    @ViewComponent
    private Div dateContainer;
    @ViewComponent
    private Span callDateLabel;
    @ViewComponent
    private Div audioPlayerContainer;
    @ViewComponent
    private VerticalLayout qaCardsContainer;
    @ViewComponent
    private Avatar personAvatar;
    @ViewComponent
    private VerticalLayout personAudioSection;

    private Passport person;
    private AiCallDataDto currentCall;
    private List<AiCallQAData> processedQA;

    public void setPerson(Passport person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setCall(AiCallDataDto call) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "summaryButton", subject = "clickListener")
    public void onSummaryButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadCallData() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildDateSection() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildPersonHeader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createAvatar() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildAudioPlayer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildQASection() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout createQACard(int questionNumber, AiCallQAData qaData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
