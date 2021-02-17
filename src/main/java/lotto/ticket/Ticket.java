package lotto.ticket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Ticket {

  private static final Random random = new Random();

  private Collection<Integer> numbers;

  public Ticket() {
    makeNumber();
  }

  private void makeNumber() {
    this.numbers = new HashSet<>();
    // List vs Set
    while (this.numbers.size() < 6) {
      int number = random.nextInt(45) + 1;
      this.numbers.add(number);
    }
  }

  public Collection<Integer> getNumbers() {
    return numbers;
  }

  @Override
  public String toString() {
    return numbers.toString();
  }
}
