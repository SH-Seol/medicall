package com.medicall.domain.treatment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.medicall.domain.member.dto.response.PrescriptionResponse;
import com.medicall.domain.treatment.dto.response.PrescriptionQrResponse;
import com.medicall.domain.treatment.entity.Prescription;
import com.medicall.domain.treatment.mapper.PrescriptionMapper;
import com.medicall.domain.treatment.repository.PrescriptionRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrescriptionQueryService {
    private final PrescriptionRepository prescriptionRepository;
    private final QrService qrService;
    private final PrescriptionMapper prescriptionMapper;

    public List<PrescriptionResponse> getAllPrescriptions(Long memberId) {
        List<Prescription> prescriptions = prescriptionRepository.findAllByMemberId(memberId);
        return prescriptionMapper.toPrescriptionResponseList(prescriptions);
    }

    public PrescriptionQrResponse getPrescriptionQrResponse(Long prescriptionId) {
        // Prescription 가져오기
        Prescription prescription = prescriptionRepository.findById(prescriptionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid prescription ID"));

        // 연관 객체 초기화
        Hibernate.initialize(prescription.getMember());
        Hibernate.initialize(prescription.getPrescriptionMedicines());
        prescription.getPrescriptionMedicines()
                .forEach(pm -> Hibernate.initialize(pm.getMedicine()));

        // 약 정보 매핑
        List<PrescriptionQrResponse.MedicineInfo> medicineInfos = prescription.getPrescriptionMedicines()
                .stream()
                .map(pm -> new PrescriptionQrResponse.MedicineInfo(
                        pm.getMedicine()
                                .getMedicineName(),
                        pm.getDosage()
                ))
                .collect(Collectors.toList());

        // DTO 생성 및 반환
        return new PrescriptionQrResponse(
                prescription.getId(),
                prescription.getMember()
                        .getNickname(),
                medicineInfos
        );
    }

    public byte[] getPrescriptionQrcode(Long prescriptionId) throws Exception{
        PrescriptionQrResponse qrResponse = getPrescriptionQrResponse(prescriptionId);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        String prescriptionJson = objectMapper.writeValueAsString(qrResponse);
        return qrService.generateQrCode(prescriptionJson, 256, 256);
    }
}
