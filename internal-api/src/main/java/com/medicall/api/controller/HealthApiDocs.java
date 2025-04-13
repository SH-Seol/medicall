package com.medicall.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "HEALTHCHECK API", description = "Health Check Endpoints")

public interface HealthApiDocs {

    @Operation(summary = "Application health check")
    String healthCheck();
}