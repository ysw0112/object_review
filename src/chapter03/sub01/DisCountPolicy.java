package chapter03.sub01;

import java.util.Arrays;
import java.util.List;

public abstract class DisCountPolicy {
  private List<DiscountCondition> conditions;

  public DisCountPolicy(DiscountCondition... conditions) {
    this.conditions = Arrays.asList(conditions);
  }

  public Money calculateDiscountAmount(Screening screening){
    for(DiscountCondition each : conditions){
      if(each.isSatisfiedBy(screening)){
        return getDiscountAmount(screening);
      }
    }
    return Money.ZERO;
  }

  protected abstract Money getDiscountAmount(Screening screening);
}
