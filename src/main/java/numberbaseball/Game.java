package numberbaseball;

public class Game {

  private final Player computer;
  private Player you;

  public Game(Player computer) {
    this.computer = computer;
  }

  public void setYou(Player you) {
    this.you = you;
  }

  public int strikes() {
    int strike = 0;
    for (int i = 0; i < computer.deck.length(); i++) {
      if (computer.deck.charAt(i) == you.deck.charAt(i)) {
        strike++;
      }
    }
    return strike;
  }

  public int ball() {
    int ball = 0;
    for (int i = 0; i < computer.deck.length(); i++) {
      if (computer.deck.contains(String.valueOf(you.deck.charAt(i))) && computer.deck.charAt(i) != you.deck.charAt(i)) {
        ball++;
      }
    }
    return ball;
  }

}
