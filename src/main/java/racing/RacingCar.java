package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import racing.game.Car;
import racing.game.Game;
import racing.printer.GamePrinter;
import racing.printer.ResultPrinter;

public class RacingCar {

  public static void main(String[] args) {

    GamePrinter gamePrinter = new GamePrinter();
    gamePrinter.start();
    Scanner in = new Scanner(System.in);

    gamePrinter.obtainCarName();
    String carNameInput = in.next();

    gamePrinter.obtainTimesToPlay();
    int timesToPlay = in.nextInt();

    List<Car> carsToRace = new ArrayList<>();
    for (String carName : carNameInput.split(",")) {
      carsToRace.add(new Car(carName));
    }
    Game game = new Game(carsToRace, timesToPlay);
    ResultPrinter resultPrinter = new ResultPrinter(game);

    while (game.isInProgress()) {
      game.nextRound();
      resultPrinter.printStep();
    }

    resultPrinter.printResult();
  }

}
