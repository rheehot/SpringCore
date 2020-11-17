package hello.core.member.service;

import hello.core.member.model.Member;

public interface MemberService {
    // 가입
    void join(Member member);

    // 조회
    Member findMember(Long memberId);
}
