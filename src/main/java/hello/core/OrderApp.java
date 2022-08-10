package hello.core;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {


//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);


        Long memberId = 1L; // 멤버를 저장할 멤버 아이디 선언
        Member member = new Member(memberId, "memberA", Grade.VIP); // 회원 생성
        memberService.join(member); // 메모리 객체에 넣어놓기(가입)

        Order order = orderService.createOrder(memberId, "itemmA", 10000);

        System.out.println("order = " + order);

    }
}

