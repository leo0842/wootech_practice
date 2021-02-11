package numberbaseball;

import java.util.Scanner;

public class Player {

  String deck;

  public Player(String deck) {
    if (deck.length() != 3) {
      throw new IllegalArgumentException("invalid length");
    }

    this.deck = deck;
  }

}
