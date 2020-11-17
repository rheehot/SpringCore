package hello.core.member.repository;

import hello.core.member.model.Member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DB가 확정이 안났기에 메모리에 저장하는 방식을
 */
public class MemoryMemberRepository implements MemberRepository {

    // 동시성 이슈를 생각해서 Thread-safe한 concurrentHashMap을 사용한다.
    private static Map<Long, Member> store = new ConcurrentHashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
