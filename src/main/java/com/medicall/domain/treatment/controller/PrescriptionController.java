package com.medicall.domain.treatment.controller;

import com.medicall.domain.treatment.repository.PrescriptionRepository;
import com.medicall.domain.treatment.service.QrService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/prescription")
@RequiredArgsConstructor
@Slf4j
public class PrescriptionController {
    private final PrescriptionRepository prescriptionRepository;
    private final QrService qrService;

    //@GetMapping("/{prescriptionId}")

}
