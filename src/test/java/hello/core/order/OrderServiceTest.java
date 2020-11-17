package hello.core.order;

import hello.core.member.enums.Grade;
import hello.core.member.model.Member;
import hello.core.member.service.MemberService;
import hello.core.member.service.MemberServiceImpl;
import hello.core.order.model.Order;
import hello.core.order.service.OrderService;
import hello.core.order.service.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        String memberName = "member a";
        Grade memberGrade = Grade.VIP;
        Member member = new Member(memberId, memberName, memberGrade);
        memberService.join(member);

        String itemName = "item A";
        int itemPrice = 10000;
        Order order = orderService.createOrder(memberId, itemName, itemPrice);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
