package com.smartbox.jobster.service.email;

import com.smartbox.jobster.pojo.MailPojo;

/**
 * @author Jobster team
 * Since: 2/10/2025 10:38 PM
 */
public interface EmailService {
    boolean sendEmail(MailPojo pojo, String to);
}
