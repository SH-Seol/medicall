package com.medicall.auth.mapper;

import com.medicall.auth.dto.response.AllowanceResponse;
import com.medicall.auth.dto.response.RefreshResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T10:37:58+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class AuthMapperImpl implements AuthMapper {

    @Override
    public AllowanceResponse toAllowanceResponse(String accessToken, String refreshToken) {
        if ( accessToken == null && refreshToken == null ) {
            return null;
        }

        AllowanceResponse.AllowanceResponseBuilder allowanceResponse = AllowanceResponse.builder();

        allowanceResponse.accessToken( accessToken );
        allowanceResponse.refreshToken( refreshToken );

        return allowanceResponse.build();
    }

    @Override
    public RefreshResponse toRefreshResponse(String accessToken) {
        if ( accessToken == null ) {
            return null;
        }

        RefreshResponse.RefreshResponseBuilder refreshResponse = RefreshResponse.builder();

        refreshResponse.accessToken( accessToken );

        return refreshResponse.build();
    }
}
