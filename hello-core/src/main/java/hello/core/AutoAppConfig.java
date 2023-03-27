package hello.core;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
@Configuration

@ComponentScan( 
		basePackages = "hello.core",
		basePackageClasses = AutoAppConfig.class,
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =Configuration.class))

public class AutoAppConfig {
	 @Bean(name = "memoryMemberRepository")
	    MemberRepository memberRepository(){
	        return new MemoryMemberRepository();
	    }

	    @Bean(name = "orderService")
	    public OrderService orderService(){
	        System.out.println("call AppConfig.orderService");
	        return new OrderServiceImpl(memberRepository(), discountPolicy());
	        //return null; ////필드주입
	    }

	    @Bean(name = "discountPolicy")
	    public DiscountPolicy discountPolicy(){

	        return new RateDiscountPolicy();
	    }
}