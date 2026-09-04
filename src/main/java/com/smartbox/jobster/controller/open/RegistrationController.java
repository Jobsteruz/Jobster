package com.smartbox.jobster.controller.open;

import com.smartbox.jobster.entity.company.ConfirmationToken;
import com.smartbox.jobster.entity.company.TemporaryCompany;
import com.smartbox.jobster.service.AuthService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.auth.LoginView;
import com.smartbox.jobster.view.auth.RegistrationView;
import com.vaadin.flow.router.Route;
import io.jmix.core.Resources;
import io.jmix.core.UnconstrainedDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(path = "/open/registration")
public class RegistrationController {
    @Autowired
    private AuthService authService;
    @Autowired
    private UserService userService;
    @Autowired
    private UnconstrainedDataManager unconstrainedDataManager;
    @Autowired
    private Resources resources;


    @RequestMapping(path = {"/confirm"})
    @ResponseBody
    public Object verifyCompany(@RequestParam String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}