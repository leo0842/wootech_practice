package racing.printer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racing.game.Car;
import racing.game.Game;

public class ResultPrinter {

  private Game game;

  public ResultPrinter(Game game) {
    this.game = game;
  }

  public void printStep() {
    System.out.println("실행결과");
    for (Car car : this.game.getCarsToRace()) {
      System.out.println(car.getName() + " : " + locationToStringFormat(car.getLocation()));
    }
    System.out.println();
  }

  private String locationToStringFormat(int location) {
    return "-".repeat(Math.max(0, location));
  }

//  public void printResult() {
//
//    int maxLocation = 0;
//    for (Car car : game.getCarsToRace()) {
//      if (maxLocation < car.getLocation()) {
//        maxLocation = car.getLocation();
//      }
//    }
//    System.out.println("Winner: ");
//    for (Car car : game.getCarsToRace()) {
//      if (maxLocation == car.getLocation()) {
//        System.out.println(car.getName());
//      }
//    }
//  }

  public void printResult() {
    int maxLocation = 0;
    List<Car> winnerCarList = new ArrayList<>();

    for (Car car : game.getCarsToRace()) {
      if (car.getLocation() > maxLocation) {
        winnerCarList.clear();
        winnerCarList.add(car);
        maxLocation = car.getLocation();
      } else if (car.getLocation() == maxLocation) {
        winnerCarList.add(car);
      }
    }

    System.out.println(winnerCarList.stream().map(Car::getName).collect(Collectors.joining(",")));
  }
}
