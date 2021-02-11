package numberbaseball;

public class Computer {

  String computerDeck = "";

  public String makeDeck() {

    while (computerDeck.length() < 3) {
      int temp = (int) (Math.random() * 10);
      if (temp != 0){
        computerDeck += String.valueOf(temp);
      }
    }
    return computerDeck;
  }

}
