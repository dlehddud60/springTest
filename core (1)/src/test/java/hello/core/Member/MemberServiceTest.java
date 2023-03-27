package hello.core.Member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;
    @BeforeEach //각 테스트 실행 전에 하는 것
    public void beforeEach(){
        AppConfig appConfig=new AppConfig();
        memberService= appConfig.memberService();
    }
    @Test
    void join(){
        //given
        Member member=new Member(1L,"memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember=memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);//검증
    }
}
