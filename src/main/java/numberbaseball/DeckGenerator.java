package numberbaseball;

public class DeckGenerator {

  private String deck = "";

  public DeckGenerator() {


    while (deck.length() < 3) {
      int temp = (int) (Math.random() * 10);
      if (temp != 0) {
        deck += String.valueOf(temp);
      }
    }
  }

  public String getDeck() {
    return deck;
  }
}
