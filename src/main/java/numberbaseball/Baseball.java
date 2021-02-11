package numberbaseball;

import java.util.Scanner;

public class Baseball {

  public static void main(String[] args) {
    String computerDeck = "";
    String yourDeck = "";
    boolean perfect = false;

    Scanner in = new Scanner(System.in);


    while (computerDeck.length() < 3) {
      int temp = (int) (Math.random() * 10);
      if (temp != 0){
        computerDeck += String.valueOf(temp);
      }
    }
    String a = "abcd";
    String b = "c";

    while (!perfect) {
      int ball = 0;
      int strike = 0;
      int n = in.nextInt();
      yourDeck = String.valueOf(n);

      for (int i = 0; i < yourDeck.length(); i++){
        if (computerDeck.charAt(i) == yourDeck.charAt(i)) {
          strike++;
        }
        else if (computerDeck.contains(String.valueOf(yourDeck.charAt(i)))) {
          ball++;
        }

      }
      if (strike == 3) {
        perfect = true;
        System.out.println("정답입니다.");
      }
      else if (ball == 0 & strike == 0) {
        System.out.println("낫싱");
      }
      else {
        if (ball == 0) {
          System.out.println(strike + "스트라이크");
        }
        else if (strike == 0) {
          System.out.println(ball + "볼");
        }
        else {
          System.out.println(strike + "스트라이크"  + ball + "볼");
        }
      }

    }
  }



}
