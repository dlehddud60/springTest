package hello.core.beanfind;

import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    @DisplayName("이름 없이 타입으로만 조회")
    void findBeanByType(){
        MemberService memberService=ac.getBean(MemberService.class);
        //System.out.println("memberService = "+memberService);
        //System.out.println("memberService.getClass() = "+memberService.getClass());
        //검증
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class); //alt+enter
    }

    @Test
    @DisplayName("구체 타입으로만 조회")
    void findBeanByType2(){
        MemberServiceImpl memberService=ac.getBean("memberService",MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class); //alt+enter
    }

    @Test
    @DisplayName("빈 이름으로 조회X")
    void findBeanByNameX(){
        //MemberService xxxxx=ac.getBean("xxxxx",MemberServiceImpl.class);
        assertThrows(NoSuchBeanDefinitionException.class,()->ac.getBean("xxxxx",MemberService.class));
    }
}
