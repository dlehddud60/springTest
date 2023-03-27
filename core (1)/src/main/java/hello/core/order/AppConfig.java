package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //설정 정보
public class AppConfig {
    //@Bean memberService->new MemoryMemberRopository(
    //@Bean orderService -> new MemoryMemberRepository()
    //4번 호출되어야 하는데 메소드가 1번 호출
    @Bean//구성,spring container에 등록
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());//생성자 주입,ctrl+alt+m 활용
    }
    
    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    
    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(),discountPolicy());
        //return null;
    }
    
    @Bean
    public DiscountPolicy discountPolicy(){
        //System.out.println("call AppConfig.discountPolicy");
        //return new RateDiscountPolicy();
        return new FixDiscountPolicy();
    }
}
