package numberbaseball;

import java.util.Scanner;


public class Baseball {

  public static void main(String[] args) {
    DeckGenerator deckGenerator = new DeckGenerator();
    Player computer = new Player(deckGenerator.getDeck());
    Game game = new Game(computer);

    Scanner in = new Scanner(System.in);

    do {
      Player you = new Player(String.valueOf(in.nextInt()));
      game.setYou(you);
      ResultPrinter resultPrinter = new ResultPrinter(game.strikes(), game.ball());
      resultPrinter.print();
    }
    while (game.strikes() < 3);


    }
  }
