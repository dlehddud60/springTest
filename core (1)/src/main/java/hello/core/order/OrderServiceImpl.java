package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor //생성자를 만들어줌,final도 있음
public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository; //참조
    //private final DiscountPolicy discountPolicy=new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy; //참조


//    //수정자
//    @Autowired
//    public void setMemberRepository(MemberRepository memberRepository){
//        //System.out.println("memberRepository = "+memberRepository);
//        this.memberRepository=memberRepository;
//    }
////    @Autowired
//    public void setDiscountPolicy(DiscountPolicy discountPolicy){
//        System.out.println("discountPolicy = "+discountPolicy);
//        this.discountPolicy=discountPolicy;
//    }

    @Autowired
    private DiscountPolicy rateDiscountPolicy;
    //생성자 주입
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository,DiscountPolicy rateDiscountPolicy) {
        //System.out.println("OrderServiceImpl");
        this.memberRepository=memberRepository;
        this.discountPolicy=rateDiscountPolicy;
    }
//    @Autowired
//    public void init(MemberRepository memberRepository, DiscountPolicy
//            discountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member=memberRepository.findById(memberId);
        int discountPrice=discountPolicy.discount(member,itemPrice);
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
