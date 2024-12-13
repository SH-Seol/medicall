package com.medicall.domain.location.service;

import com.medicall.domain.location.domain.entity.Hospital;
import com.medicall.domain.location.domain.repository.HospitalRepository;
import com.medicall.domain.location.dto.response.HospitalResponse;
import com.medicall.domain.location.mapper.HospitalMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HospitalQueryService {
    private final HospitalRepository hospitalRepository;
    private final HospitalMapper hospitalMapper;

    public List<HospitalResponse> getHospitals(String keyword){
        List<Hospital> hospitals = hospitalRepository.searchByTitleOrSpeciality(keyword);
        List<HospitalResponse> responses = hospitalMapper.toResponseList(hospitals);
        log.info("hospitals responses: " + responses.toString());
        return responses;
    }
}
