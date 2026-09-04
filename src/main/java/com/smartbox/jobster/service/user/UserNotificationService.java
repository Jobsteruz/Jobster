package com.smartbox.jobster.service.user;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.user.UserConfirmationToken;
import com.smartbox.jobster.pojo.MailPojo;
import com.smartbox.jobster.pojo.SmsPojo;
import com.smartbox.jobster.service.MQService;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.TimeSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

@Service
public class UserNotificationService {
    private static final int TOKEN_SIZE_BYTES = 32;
    private static final int EXPIRATION_HOURS = 6;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private MQService mqService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private Messages messages;

    @Value("${app.url:http://localhost:8081}")
    private String appUrl;

    public void sendUserActivationLink(User user, String phone, String email) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private UserConfirmationToken createConfirmationToken(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendEmail(User user, String email, String link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendSms(User user, String phone, String link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public UserConfirmationToken getConfirmationTokenByToken(String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isTokenValid(UserConfirmationToken token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void markTokenAsUsed(UserConfirmationToken token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void invalidateUserTokens(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String generateToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
