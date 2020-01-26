package chapter01.sub03;

import java.util.ArrayList;
import java.util.List;

public class main {

  public static void main(String[] args) {
    List<Audience> audienceList = new ArrayList<>();
    Audience hasNotInvitationAudience = new Audience(new Bag(10000L));
    Audience hasInvitationAudience = new Audience(new Bag(new Invitation(),10000L));
    audienceList.add(hasNotInvitationAudience);
    audienceList.add(hasInvitationAudience);

    TicketSeller ticketSeller = new TicketSeller(new TicketOffice(100000L, new Ticket(500L), new Ticket(1000L)));

    Theater theater = new Theater(ticketSeller);

    audienceList.stream().forEach(audience -> {
      theater.enter(audience);
    });
  }
}
