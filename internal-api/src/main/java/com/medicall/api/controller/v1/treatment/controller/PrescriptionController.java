package com.medicall.api.controller.v1.treatment.controller;

import com.medicall.api.auth.security.oauth2.dto.CustomOAuth2User;
import com.medicall.domain.member.dto.response.PrescriptionResponse;
import com.medicall.domain.treatment.repository.PrescriptionRepository;
import com.medicall.domain.treatment.service.PrescriptionQueryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/prescriptions")
@Slf4j
public class PrescriptionController {
    private final PrescriptionRepository prescriptionRepository;
    private final PrescriptionQueryService prescriptionQueryService;

    /*
    처방전 QR코드 반환
     */
    @GetMapping("{prescriptionId}")
    public ResponseEntity<byte[]> getPrescription(@PathVariable Long prescriptionId) throws Exception {
        byte[] qr = prescriptionQueryService.getPrescriptionQrcode(prescriptionId);
        return ResponseEntity.ok(qr);
    }

    /*
    처방전 목록 반환
     */
    @GetMapping("")
    public ResponseEntity<List<PrescriptionResponse>> getAllPrescription(@AuthenticationPrincipal CustomOAuth2User user) {
        List<PrescriptionResponse> response = prescriptionQueryService.getAllPrescriptions(user.getMemberId());
        log.warn("prescription list: {}",response.toString());
        return ResponseEntity.ok(response);
    }
}
