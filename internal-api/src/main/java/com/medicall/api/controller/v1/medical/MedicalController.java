package com.medicall.api.controller.v1.medical;

import com.medicall.domain.location.HospitalService;
import com.medicall.domain.doctor.DoctorService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/medical")
public class MedicalController {

//    private final HospitalService hospitalQueryService;
//    private final DoctorService doctorQueryService;
//
//    /*
//    병원 검색 정보 가져오기
//     */
//    @GetMapping("search")
//    public List<HospitalResponse> getHospitals(@RequestParam String keyword) {
//        log.warn("getHospital: {}", keyword);
//        return hospitalQueryService.getHospitals(keyword);
//    }
//
//    /*
//    개별 병원 가져오기
//     */
//    @GetMapping("/hospitals/{hospitalId}")
//    public Hospital getHospital(@PathVariable int hospitalId) {
//        log.warn("getHospital: {}", hospitalId);
//        return null;
//    }
//
//    /*
//    병원에 속한 의사 목록 가져오기
//     */
//    @GetMapping("/{hospitalId}/doctors")
//    public List<Doctor> getDoctors(@PathVariable Long hospitalId) {
//        log.warn("getDoctors: {}", hospitalId);
//        return null;
//    }
//
//    /*
//    개별 의사 가져오기
//     */
//    @GetMapping("/{doctorId}")
//    public DoctorProfileResponse getDoctor(@PathVariable Long doctorId) {
//        log.warn("getDoctorone: {}", doctorId);
//        return doctorQueryService.getDoctorProfile(doctorId);
//    }
}
