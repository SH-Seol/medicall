package com.medicall.api.auth;

import com.medicall.api.auth.dto.request.AllowanceRequest;
import com.medicall.api.auth.dto.response.AllowanceResponse;
import com.medicall.api.auth.dto.response.RefreshResponse;
import com.medicall.api.auth.oauth2.dto.CustomOAuth2User;
import com.medicall.api.auth.security.JwtService;
import com.medicall.support.error.response.ResponseFactory;
import com.medicall.support.error.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "\uD83D\uDD11 인증", description = "Auth API")
public class AuthController {

    private final JwtService jwtService;
    private final CookieProperties properties;

    public AuthController(JwtService jwtService, CookieProperties properties) {
        this.jwtService = jwtService;
        this.properties = properties;
    }

    @Operation(summary = "accessToken 재발급")
    @PostMapping("/token/reissue")
    public ApiResponse<AccessTokenRefreshResponse> reissueAccessToken(
            HttpServletRequest httpRequest
    ) {
        String refreshToken = JwtHttpExtractor.extractRefreshToken(httpRequest, properties.refresh()
                .name());
        var result = jwtService.reissueAccessToken(refreshToken);
        return ApiResponse.success(AccessTokenRefreshResponse.of(result));
    }

    @Operation(summary = "약관 동의")
    @PostMapping("/terms")
    public ResponseEntity<SuccessResponse<AllowanceResponse>> agreeToTerms(
            @Valid @RequestBody AllowanceRequest request,
            HttpServletResponse response
    ) throws IOException {
        var result = authService.updateAllowance(request.token());
        return ResponseFactory.success(result);
    }

    @Operation(summary = "로그아웃")
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(
            HttpServletRequest request,
            @AuthenticationPrincipal CustomOAuth2User oAuth2User
    ) {
        String accessToken = jwtService.resolveAccessToken(request);
        authService.logout(oAuth2User.getMemberId(), accessToken);
        return ResponseFactory.noContent();
    }
}
