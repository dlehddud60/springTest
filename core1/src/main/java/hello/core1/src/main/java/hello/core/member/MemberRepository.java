package hello.core1.src.main.java.hello.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
