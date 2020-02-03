package chapter03.sub01;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class main {

  public static void main(String[] args) {
    Movie avatar = new Movie("아바타", Duration.ofMinutes(120), Money
        .wons(10000), new AmountDiscountPolicy(Money.wons(800),
        new SequenceCondition(1),
        new SequenceCondition(10),
        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))));

    Screening screeningForAvatar = new Screening(avatar, 5, LocalDateTime.now());

  }
}
