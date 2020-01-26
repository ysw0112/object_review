package chapter01.sub01;

public class Bag {

  private Long amount;
  private Invitation invitation;
  private Ticket ticket;

  public Bag(Long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, Long amount) {
    this.amount = amount;
    this.invitation = invitation;
  }

  @Override
  public String toString() {
    return "Bag{" +
        "amount=" + amount +
        ", invitation=" + invitation +
        ", ticket=" + ticket +
        '}';
  }

  public boolean hasInvitation() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public void plusAmount(Long amount) {
    this.amount -= amount;
  }
}
