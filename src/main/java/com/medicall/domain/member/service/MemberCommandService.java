package com.medicall.domain.member.service;

import com.medicall.domain.member.domain.repository.DoctorRepository;
import com.medicall.domain.member.domain.repository.PatientRepository;
import com.medicall.domain.member.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberCommandService {

    private final MemberRepository memberRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;


}
