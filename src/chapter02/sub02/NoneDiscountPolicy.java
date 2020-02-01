package chapter02.sub02;

public class NoneDiscountPolicy extends DisCountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
