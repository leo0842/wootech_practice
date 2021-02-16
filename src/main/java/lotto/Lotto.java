package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import lotto.ticket.Ticket;
import lotto.ticket.TicketComparator;
import lotto.ticket.TicketGenerator;

public class Lotto {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("구입 금액을 입력해 주세요.");

    int payment = in.nextInt();
    int ticketAmount = payment / 1000;

    System.out.println(ticketAmount + "개를 구매했습니다.");

    TicketGenerator ticketGenerator = new TicketGenerator();
    ticketGenerator.generate(ticketAmount);
    ticketGenerator.printTickets();

    System.out.println("지난 주 당첨 번호를 입력해 주세요.");

    String[] winNumber = in.next().split(",");
    List<Integer> winNumbers = Arrays.stream(winNumber).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());

    System.out.println("보너스 볼을 입력해 주세요.");

    int bonusNumber = in.nextInt();

    System.out.println("당첨 통계");
    System.out.println("----------");

    List<Integer> winCount = new ArrayList<>();
    ticketGenerator.getTickets().forEach(ticket -> {
      TicketComparator comparator = new TicketComparator(ticket, new LottoNumber(winNumbers, bonusNumber));
      winCount.add(comparator.winCount());
    });
    winPrinter(winCount);
    pricePrinter(winCount, payment);

  }

  private static void winPrinter(List<Integer> winCount) {
    System.out.println("3개 일치 (5000원)" + winCount.stream().filter(integer -> integer == 5).count());
    System.out.println("4개 일치 (50000원)" + winCount.stream().filter(integer -> integer == 4).count());
    System.out.println("5개 일치 (150000원)" + winCount.stream().filter(integer -> integer == 3).count());
    System.out.println("5개 일치, 보너스 볼 일치(30000000원)" + winCount.stream().filter(integer -> integer == 2).count());
    System.out.println("6개 일치 (200000000원)" + winCount.stream().filter(integer -> integer == 1).count());

  }

  private static void pricePrinter(List<Integer> winCount, int payment) {
    System.out.println(
        (
            winCount.stream().filter(integer -> integer == 5).count() * 5000 +
                winCount.stream().filter(integer -> integer == 4).count() * 50000 +
                winCount.stream().filter(integer -> integer == 3).count() * 150000 +
                winCount.stream().filter(integer -> integer == 2).count() * 30000000 +
                winCount.stream().filter(integer -> integer == 1).count() * 200000000
        )
            / payment
    );
  }
}
