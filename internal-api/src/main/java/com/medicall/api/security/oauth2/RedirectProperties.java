package com.medicall.api.auth.oauth2;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("auth.client.redirect")
public record RedirectProperties(
        String authenticatedRedirectUrl,
        String termsRedirectUrl
) {
}
