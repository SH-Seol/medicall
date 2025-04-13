package com.medicall.domain.doctor;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

//    private final DoctorRepository doctorRepository;
//    private final DoctorMapper doctorMapper;
//
//    public List<DoctorResponse> getAllDoctorFromPatient(Long memberId) {
//        List<Doctor> doctors = doctorRepository.findDoctorsByMemberId(memberId);
//        List<DoctorResponse> response = doctorMapper.toDoctorResponseList(doctors);
//        log.warn("doctors list: {}", response.toString());
//        return response;
//    }
//
//    public DoctorProfileResponse getDoctorProfile(Long doctorId) {
//        Doctor doctor = doctorRepository.findById(doctorId).get();
//        log.warn("doctorProfile: {}", doctor.toString());
//        return doctorMapper.toDoctorProfileResponse(doctor);
//
//    }
}
