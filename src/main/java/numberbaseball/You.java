package numberbaseball;

import java.util.Scanner;

public class You {


  String yourDeck;
  StrikeAndBall strikeAndBall = new StrikeAndBall();


  public void getYourDeck(Scanner in) {
    int n = in.nextInt();
    yourDeck = String.valueOf(n);
  }

  public void calculate(String computerDeck) {
    for (int i = 0; i < yourDeck.length(); i++){
      if (computerDeck.charAt(i) == yourDeck.charAt(i)) {
        strikeAndBall.strike++;
      }
      else if (computerDeck.contains(String.valueOf(yourDeck.charAt(i)))) {
        strikeAndBall.ball++;
      }
    }

  }

}
