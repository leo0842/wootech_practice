package lotto.ticket;

import java.util.ArrayList;
import java.util.List;
import lotto.LottoNumber;

public class TicketComparator {

  private final Ticket ticket;
  private final LottoNumber lottoNumber;

  public TicketComparator(Ticket ticket, LottoNumber lottoNumber) {
    this.ticket = ticket;
    this.lottoNumber = lottoNumber;
  }

  public int winCount() {
    int winCount = 0;

    for (int number : lottoNumber.getWinNumber()) {
      if (this.ticket.getNumbers().contains(number)) {
        winCount++;
      }
    }
    return grade(winCount, lottoNumber.getBonusNumber());
  }

  private Integer grade(int count, int bonusNumber) {
    if (count == 3) {
      return 5;
    } else if (count == 4) {
      return 4;
    } else if (count == 5) {
      if (this.ticket.getNumbers().contains(bonusNumber)) {
        return 2;
      } else {
        return 3;
      }
    } else if (count == 6) {
      return 1;
    } else {
      return 0;
    }
  }
}
