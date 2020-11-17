package hello.core.member.repository;

import hello.core.member.model.Member;

public interface MemberRepository {
    // 가입
    void save(Member member);

    // 조회
    Member findById(Long memberId);
}
