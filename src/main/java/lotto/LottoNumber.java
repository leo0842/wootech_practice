package lotto;

import java.util.List;

public class LottoNumber {

  private final List<Integer> winNumber;
  private final Integer bonusNumber;

  public LottoNumber(List<Integer> winNumber, Integer bonusNumber) {
    this.winNumber = winNumber;
    this.bonusNumber = bonusNumber;
  }

  public List<Integer> getWinNumber() {
    return winNumber;
  }

  public Integer getBonusNumber() {
    return bonusNumber;
  }
}
