package lotto.ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketGenerator {

  private List<Ticket> tickets;

  public void generate(int amount) {
    System.out.println("티켓");

    if (this.tickets == null) {
      this.tickets = new ArrayList<>();
    }

    for (int i = 0; i < amount; i++) {
      this.tickets.add(new Ticket());
    }
  }

  public void printTickets() {
    this.tickets.forEach(ticket -> System.out.println(ticket.toString()));
  }

  public List<Ticket> getTickets() {
    return tickets;
  }
}
