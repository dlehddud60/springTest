package hello.core;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
public class MemberApp {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		Member member = new Member(1L, "memberA", Grade.VIP);//아이디가1L인값은 새로생성
		memberService.join(member);//만들어서 주입 
		Member findMember = memberService.findMember(1L);//찾아주기 
		System.out.println("new member = " + member.getName());
		System.out.println("find Member = " + findMember.getName());
	}	
}