package com.medicall.domain.medical.controller;

import com.medicall.domain.location.domain.entity.Hospital;
import com.medicall.domain.location.dto.response.HospitalResponse;
import com.medicall.domain.location.service.HospitalQueryService;
import com.medicall.domain.medical.domain.entity.Doctor;
import com.medicall.domain.member.dto.response.DoctorProfileResponse;
import com.medicall.domain.member.service.medical.DoctorQueryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/medical")
public class MedicalController {

    private final HospitalQueryService hospitalQueryService;
    private final DoctorQueryService doctorQueryService;

    /*
    병원 검색 정보 가져오기
     */
    @GetMapping("search")
    public List<HospitalResponse> getHospitals(@RequestParam String keyword) {
        log.warn("getHospital: {}", keyword);
        return hospitalQueryService.getHospitals(keyword);
    }

    /*
    개별 병원 가져오기
     */
    @GetMapping("/hospitals/{hospitalId}")
    public Hospital getHospital(@PathVariable int hospitalId) {
        log.warn("getHospital: {}", hospitalId);
        return null;
    }

    /*
    병원에 속한 의사 목록 가져오기
     */
    @GetMapping("/{hospitalId}/doctors")
    public List<Doctor> getDoctors(@PathVariable Long hospitalId) {
        log.warn("getDoctors: {}", hospitalId);
        return null;
    }

    /*
    개별 의사 가져오기
     */
    @GetMapping("/{doctorId}")
    public DoctorProfileResponse getDoctor(@PathVariable Long doctorId) {
        log.warn("getDoctorone: {}", doctorId);
        return doctorQueryService.getDoctorProfile(doctorId);
    }
}
