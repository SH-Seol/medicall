package com.medicall.domain.member.controller.member;

import com.medicall.auth.security.oauth2.dto.CustomOAuth2User;
import com.medicall.domain.member.domain.repository.DoctorRepository;
import com.medicall.domain.member.domain.repository.PatientRepository;
import com.medicall.domain.member.dto.request.MedicalRoleRequest;
import com.medicall.domain.member.dto.response.DoctorResponse;
import com.medicall.domain.member.dto.response.MedicalRoleResponse;
import com.medicall.domain.member.dto.response.ProfileResponse;
import com.medicall.domain.member.service.medical.DoctorQueryService;
import com.medicall.domain.member.service.member.MemberQueryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
@Tag(name = "\uD83D\uDC68\u200D\uD83C\uDF3E 사용자", description = "Member API")
public class MemberController {
    private final MemberQueryService memberQueryService;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final DoctorQueryService doctorQueryService;


    /*
    의료 상태 추가
     */
    @PostMapping("/medical")
    public ResponseEntity<MedicalRoleResponse> addMedicalRole(
            @RequestBody MedicalRoleRequest medicalRoleRequest,
            @AuthenticationPrincipal CustomOAuth2User user) {
        return null;
    }

    /*
    나의 프로필 가져오기
     */
    @GetMapping("/profile")
    public ResponseEntity<ProfileResponse> getProfile(@AuthenticationPrincipal CustomOAuth2User user) {
        ProfileResponse response = memberQueryService.getProfile(user.getMemberId());
        System.out.println(response);
        return ResponseEntity.ok(response);
    }

    /*
    진료를 봐준 의사들 가져오기
     */
    @GetMapping("/doctors")
    public ResponseEntity<List<DoctorResponse>> getDoctor(@AuthenticationPrincipal CustomOAuth2User user) {
        List<DoctorResponse> response = doctorQueryService.getAllDoctorFromPatient();
        return ResponseEntity.ok(response);
    }


}
