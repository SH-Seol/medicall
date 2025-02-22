package com.medicall.domain.member.service.medical;

import com.medicall.domain.medical.domain.entity.Doctor;
import com.medicall.domain.medical.domain.repository.DoctorRepository;
import com.medicall.domain.medical.mapper.DoctorMapper;
import com.medicall.domain.member.dto.response.DoctorProfileResponse;
import com.medicall.domain.member.dto.response.DoctorResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DoctorQueryService {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public List<DoctorResponse> getAllDoctorFromPatient(Long memberId) {
        List<Doctor> doctors = doctorRepository.findDoctorsByMemberId(memberId);
        List<DoctorResponse> response = doctorMapper.toDoctorResponseList(doctors);
        log.warn("doctors list: {}", response.toString());
        return response;
    }

    public DoctorProfileResponse getDoctorProfile(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId).get();
        log.warn("doctorProfile: {}", doctor.toString());
        return doctorMapper.toDoctorProfileResponse(doctor);

    }
}
