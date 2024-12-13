package com.medicall.domain.member.controller.medical;

import com.medicall.domain.location.domain.entity.Hospital;
import com.medicall.domain.member.domain.entity.Doctor;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/medical")
public class MedicalController {
    /*
    병원 검색 정보 가져오기
     */
    @GetMapping("search")
    public List<Hospital> getHospitals(@RequestParam String keyword) {
        return null;
    }

    /*
    개별 병원 가져오기
     */
    @GetMapping("/hospitals/{hospitalId}")
    public Hospital getHospital(@PathVariable int hospitalId) {
        return null;
    }

    /*
    병원에 속한 의사 목록 가져오기
     */
    @GetMapping("/{hospitalId}/doctors")
    public List<Doctor> getDoctors(@PathVariable Long hospitalId) {
        return null;
    }

    /*
    개별 의사 가져오기
     */
    @GetMapping("/{doctorId}")
    public Doctor getDoctor(@PathVariable int doctorId) {
        return null;
    }
}
