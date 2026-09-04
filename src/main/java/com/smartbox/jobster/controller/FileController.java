package com.smartbox.jobster.controller;

import com.google.common.net.HttpHeaders;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.common.util.URLEncodeUtils;
import io.jmix.core.security.Authenticated;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jobster team
 * Date: 11/15/2023 2:40 PM
 */
@Controller
@RequestMapping("/file")
public class FileController {
    private static final Logger log = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileStorage fileStorage;

    @GetMapping
    public void file(
            HttpServletResponse response,
            @RequestParam String fileRef
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/inline")
    public void inlineFile(
            HttpServletResponse response,
            @RequestParam String fileRef
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @GetMapping("/inline/public")
    public void inlinePublicFile(
            HttpServletResponse response,
            @RequestParam String fileRef
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void downloadFromMiddleware(InputStream inputStream, HttpServletResponse response) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SneakyThrows
    protected void error(HttpServletResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
