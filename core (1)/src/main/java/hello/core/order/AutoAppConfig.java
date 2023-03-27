package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import java.security.DigestInputStream;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member",
    excludeFilters=@ComponentScan.Filter(type= FilterType.ANNOTATION, classes=Configuration.class))
public class AutoAppConfig {

//    @Bean(name="memoryMemberRepository") //component가 소문자로 바뀜
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }

}
