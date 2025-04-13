package com.medicall.domain.member;


import java.util.Optional;

public interface MemberRepository {
    Long save(NewMember newMember);
    Optional<Member> findByEmail(String email);
    Optional<Member> findById(Long memberId);
    boolean existsById(Long id);
    void delete(Member member);
    boolean existByEmail(String email);
}
