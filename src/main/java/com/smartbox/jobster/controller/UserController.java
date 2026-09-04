package com.smartbox.jobster.controller;


import com.google.common.base.Strings;
import com.smartbox.jobster.AppBeans;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.core.security.PasswordNotMatchException;
import io.jmix.core.security.UserManager;
import io.jmix.flowui.view.MessageBundle;
import io.jmix.securityflowui.password.PasswordValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final CurrentAuthentication currentAuthentication;
    private final MessageBundle messageBundle;
    private final PasswordValidation passwordValidation;


    @PostMapping(value = "/changePassword", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> changePassword(@RequestParam String currentPassword, @RequestParam String newPassword, @RequestParam String confirmPassword) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String validatePassword(String currentPassword, String password, String confirmPassword, UserDetails user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
