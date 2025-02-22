package com.medicall.auth.mapper;

import com.medicall.auth.dto.response.AllowanceResponse;
import com.medicall.auth.dto.response.RefreshResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AuthMapper {
    AllowanceResponse toAllowanceResponse(String accessToken, String refreshToken);
    RefreshResponse toRefreshResponse(String accessToken);
}

