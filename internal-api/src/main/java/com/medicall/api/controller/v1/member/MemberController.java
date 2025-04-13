package com.medicall.api.controller.v1.member;

import com.medicall.domain.doctor.DoctorService;
import com.medicall.domain.member.MemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@Tag(name = "\uD83D\uDC68\u200D\uD83C\uDF3E 사용자", description = "Member API")
public class MemberController {
//    private final MemberService memberQueryService;
//    private final DoctorRepository doctorRepository;
//    private final DoctorService doctorQueryService;
//
//
//    /*
//    의료 상태 추가
//     */
//    @PostMapping("/medical")
//    public ResponseEntity<MedicalRoleResponse> addMedicalRole(
//            @RequestBody MedicalRoleRequest medicalRoleRequest,
//            @AuthenticationPrincipal CustomOAuth2User user) {
//        log.warn("addMedicalRole: {}", user.getMemberId());
//        return null;
//    }
//
//    /*
//    나의 프로필 가져오기
//     */
//    @GetMapping("/profile")
//    public ResponseEntity<ProfileResponse> getProfile(@AuthenticationPrincipal CustomOAuth2User user) {
//        ProfileResponse response = memberQueryService.getProfile(user.getMemberId());
//        log.warn("getProfile: {}", user.getMemberId());
//        System.out.println(response);
//        return ResponseEntity.ok(response);
//    }
//
//    /*
//    진료를 봐준 의사들 가져오기
//     */
//    @GetMapping("/doctors")
//    public ResponseEntity<List<DoctorResponse>> getDoctor(@AuthenticationPrincipal CustomOAuth2User user) {
//        log.info("getDoctor: {}", user.getMemberId());
//        List<DoctorResponse> response = doctorQueryService.getAllDoctorFromPatient(user.getMemberId());
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("/appointment")
//    public ResponseEntity<AppointmentResponse> getAppointment(@AuthenticationPrincipal CustomOAuth2User user) {
//        log.warn("getAppointment: {}", user.getMemberId());
//        return null;
//    }
//

}
