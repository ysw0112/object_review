package chapter03.sub01;


import java.time.Duration;

public class Movie {
  private String title;
  private Duration runningTime;
  private Money fee;
  private DisCountPolicy disCountPolicy;

  public Movie(String title, Duration runningTime, Money fee,
      DisCountPolicy disCountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.disCountPolicy = disCountPolicy;
  }

  public Money getFee() {
    return null;
  }

  public Money calculateMovieFee(Screening screening){
    return fee.minus(disCountPolicy.calculateDiscountAmount((screening)));
  }
}
