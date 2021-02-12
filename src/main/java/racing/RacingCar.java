package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCar {

  public static void main(String[] args) {

    Game game = new Game();

    Printer printer = new Printer();

    printer.start();
    Scanner in = new Scanner(System.in);

    printer.obtainCarName();
    game.addCars(in.next());

    printer.obtainTimesToPlay();
    int timesToPlay = in.nextInt();

    game.raceStart(timesToPlay);

    printer.result(game.carsToRace);
  }

}
