//package com.smartbox.jobster.config;
//
//import com.smartbox.jobster.AppBeans;
//import com.smartbox.jobster.entity.hrm.Employee;
//import com.smartbox.jobster.service.person.EmployeeService;
//import jakarta.annotation.PostConstruct;
//import org.jetbrains.annotations.NotNull;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.server.authorization.authentication.OAuth2AccessTokenAuthenticationToken;
//import org.springframework.security.oauth2.server.authorization.web.OAuth2TokenEndpointFilter;
//import org.springframework.security.oauth2.server.authorization.web.authentication.OAuth2AccessTokenResponseAuthenticationSuccessHandler;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Optional;
//
//@Component
//public class TokenEndpointFilterCustomizationBean {
//
//    @Autowired
//    @Qualifier("authsr_AuthorizationServerSecurityFilterChain")
//    private SecurityFilterChain authorizationServerSecurityFilterChain;
//
//
//    @PostConstruct
//    public void modifyFilterChain() {
//
//        Optional<OAuth2TokenEndpointFilter> tokenEndpointFilter = authorizationServerSecurityFilterChain.getFilters().stream()
//                .filter(filter -> OAuth2TokenEndpointFilter.class.isAssignableFrom(filter.getClass()))
//                .map(f -> (OAuth2TokenEndpointFilter) f)
//                .findAny();
//
//        if (tokenEndpointFilter.isEmpty()) {
//            throw new RuntimeException("No OAuth2TokenEndpointFilter found");
//        }
//
//        OAuth2AccessTokenResponseAuthenticationSuccessHandler successHandler = getOAuth2AccessTokenResponseAuthenticationSuccessHandler();
//
//        tokenEndpointFilter.get().setAuthenticationSuccessHandler(successHandler);
//    }
//
//    private static @NotNull OAuth2AccessTokenResponseAuthenticationSuccessHandler getOAuth2AccessTokenResponseAuthenticationSuccessHandler() {
//        OAuth2AccessTokenResponseAuthenticationSuccessHandler successHandler = new OAuth2AccessTokenResponseAuthenticationSuccessHandler();
//        successHandler.setAccessTokenResponseCustomizer(c ->
//        {
//            Authentication authentication = c.get(Authentication.class);
//            if (authentication instanceof OAuth2AccessTokenAuthenticationToken authToken) {
//                var additionalParameters = new HashMap<>(authToken.getAdditionalParameters());
//
////                Employee employee = AppBeans.get(EmployeeService.class).getByUsername(request.getParameter("username"), "employee-role-type-mobile");
////                Employee employee = AppBeans.get(EmployeeService.class).currentEmployee("employee-role-type-mobile");
////                additionalParameters.put("employee", employee.getId());
////                additionalParameters.put("roleType", employee.getRoleType() == null ? null : employee.getRoleType().getName().toLowerCase());
//
//                c.getAccessTokenResponse().additionalParameters(additionalParameters);
//            }
//        });
//        return successHandler;
//    }
//}