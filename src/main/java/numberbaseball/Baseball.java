package numberbaseball;

import java.util.Scanner;

class Computer {
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

class StrikeAndBall {
  int strike = 0;
  int ball = 0;
  String answer;
  boolean perfect = false;

  public String check() {
    if (strike == 3) {
      perfect = true;
      answer = "정답입니다.";
    }
    else if (ball == 0 & strike == 0) {
      answer = "낫싱";
    }
    else {
      if (ball == 0) {
        answer = strike + "스트라이크";
      }
      else if (strike == 0) {
        answer = ball + "볼";
      }
      else {
        answer = strike + "스트라이크"  + ball + "볼";
      }

  }
    return answer;
}

static class You {

  String yourDeck;


  public void getYourDeck(Scanner in) {
    int n = in.nextInt();
    yourDeck = String.valueOf(n);
  }
  StrikeAndBall strikeAndBall = new StrikeAndBall();

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


public static class Baseball {

  public static void main(String[] args) {
    String computerDeck;
    Computer computer = new Computer();
    boolean perfect = false;

    Scanner in = new Scanner(System.in);

    computerDeck = computer.makeDeck();
    System.out.println(computerDeck);

    while (!perfect) {

      You you = new You();

      you.getYourDeck(in);

      you.calculate(computerDeck);

      System.out.println(you.strikeAndBall.check());

      perfect = you.strikeAndBall.perfect;
      }

    }
  }



}
