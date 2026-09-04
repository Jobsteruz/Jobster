package com.smartbox.jobster.utils;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.service.EntityService;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;

import java.util.*;

public class ActionUtils {

    /**
     * Hands the recruiter's message text to {@code template} before sending.
     * <p>
     * A mass-action dialog can only preview one language — the first recipient's — so writing that
     * preview onto the template would message every candidate in that language. When the text is
     * still the previewed text (nobody typed over it) the stored template text is kept instead and
     * flagged for localization, and {@code AutoFillTemplateService} then resolves it into each
     * recipient's own language. A hand-written message has no translations, so it is sent verbatim.
     *
     * @param previewBody the message text as the editor reported it right after it was populated
     * @param previewSms  the SMS text as the editor reported it right after it was populated
     */
    public static void applyMessage(AutoFillTemplate template, String body, String sms,
                                    String previewBody, String previewSms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<Platform> getActualPlatforms(JbEntity<UUID> entity, List<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Platform getDefaultPlatform(List<Platform> candidatePlatforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void setCandidatePlatforms(JmixCheckboxGroup<Platform> platformBox, JbEntity<UUID> jbEntity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static Platform resolveApplicantPlatform(JbEntity<UUID> jbEntity, List<Platform> actualPlatforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
