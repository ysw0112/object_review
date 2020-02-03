package chapter03.sub01;

public class NoneDiscountPolicy extends DisCountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
