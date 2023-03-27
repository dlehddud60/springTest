package hello.core.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;
import hello.core.member.MemberService;

class OrderServiceTest {
	MemberService memberService;
	OrderService orderService;
 @BeforeEach
 public void beforeEach() {
	 AppConfig appConfig = new AppConfig();
	 memberService = appConfig.memberService();
	 orderService = appConfig.orderService();
 }

}