import org.junit.jupiter.api.Test;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderServiceImpl;

public class OrderServiceImple {
	 @Test
	 void createOrder() {
	  OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
	  MemoryMemberRepository memberRepository=new MemoryMemberRepository();		
	  memberRepository.save(new Member(1L,"item",Grade.VIP));
	  orderService.createOrder(1L, "itemA", 10000);
	 }
	
	
	
}
