package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //주문 생성 요청이 오면
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId); // 회원정보를 조회를 먼저 하고
        int discountPrice = discountPolicy.discount(member, itemPrice); // 할인 정책에 회원 자체를 넘기는 것이다. 이곳에 grade를 넘길지 멤버자체를 넘길지는 고민할 문제

        return new Order(memberId, itemName, itemPrice, discountPrice); // 최종생성된 주문을 넘긴다.
    }
}
