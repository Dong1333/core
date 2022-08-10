package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     * @return  할인 대상 금액 이걸 호출하고나면 결과로 1000원이 할 됐다면 1000원을 리턴해주는 것
     */
    int discount(Member member, int price);
}
