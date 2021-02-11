package numberbaseball;

import java.util.Scanner;


public class Baseball {

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
