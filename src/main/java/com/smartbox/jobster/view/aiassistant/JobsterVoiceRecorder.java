package com.smartbox.jobster.view.aiassistant;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.service.FileService;
import com.vaadin.flow.component.dependency.JsModule;
import io.jmix.core.FileRef;
import lombok.Getter;
import lombok.Setter;
import org.vaadin.sudebi.Audio;

import java.util.UUID;
import java.util.function.Consumer;

@JsModule("./audio-element.ts")
public class JobsterVoiceRecorder extends Audio {
    @Getter
    private FileRef recordedFileRef;
    @Setter
    private Consumer<FileRef> stopRecordingCallback;

    private final FileService fileService = AppBeans.get(FileService.class);


    @Override
    public void setRecordedAudio(String base64Audio) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
