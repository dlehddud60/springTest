package hello.core.member;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Membertest {

	@Test
	void membertest() {
		
		Member member = new Member(1L, "memberA", Grade.VIP);//아이디가1L인값은 새로생성	
		assertThat(member.getGrade()).isEqualTo(Grade.VIP);
	}
	
}
