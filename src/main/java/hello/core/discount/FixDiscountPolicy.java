package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) { // enum은 ==을 사용한다.
            return discountFixAmount; // vip면 1000원 할인
        } else { // 아니면 없다.
            return 0;
        }
    }
}