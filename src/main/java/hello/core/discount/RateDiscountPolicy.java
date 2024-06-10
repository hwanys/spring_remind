package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

/*
    vip라면 -> 금액별 10% 할인 적용!
 */
@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountRateAmount = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountRateAmount / 100;
        }else{
            return 0;
        }
    }
}
