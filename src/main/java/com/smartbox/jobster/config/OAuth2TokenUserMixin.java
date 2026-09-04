package com.smartbox.jobster.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smartbox.jobster.entity.ui.Navigation;
import io.jmix.authserver.service.mapper.DefaultOAuth2TokenUserMixin;

public class OAuth2TokenUserMixin extends DefaultOAuth2TokenUserMixin {

    @JsonIgnore
    private Navigation navigation;
}
