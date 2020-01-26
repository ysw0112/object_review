package chapter01.sub03;

public class TicketSeller {
  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience){
    ticketOffice.sellTicketTo(audience);
    System.out.println(audience);
  }
}
