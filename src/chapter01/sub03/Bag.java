package chapter01.sub03;

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

  public Long hold(Ticket ticket) {
    if (hasInvitation()){
      setTicket(ticket);
      return 0L;
    }else{
      setTicket(ticket);
      minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }

  private boolean hasInvitation() {
    return invitation != null;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  private void minusAmount(Long amount) {
    this.amount -= amount;
  }

  private void plusAmount(Long amount) {
    this.amount -= amount;
  }

  @Override
  public String toString() {
    return "Bag{" +
        "amount=" + amount +
        ", invitation=" + invitation +
        ", ticket=" + ticket +
        '}';
  }
}
