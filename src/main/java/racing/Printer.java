package racing;

import java.util.List;

public class Printer {

  public void start() {
    System.out.println("Game Start!");
  }


  public void obtainCarName() {
    System.out.println("Input Car Name!");
  }

  public void obtainTimesToPlay() {
    System.out.println("Input Integer To Play");
  }

  public void result(List<Car> carsToRace) {

    int maxLocation = 0;
    for (Car car : carsToRace){
      if (maxLocation < car.getLocation()) {
        maxLocation = car.getLocation();
      }
    }
    System.out.println("Winner: ");
    for (Car car : carsToRace) {
      if (maxLocation == car.getLocation()) {
        System.out.println(car.getName());
      }
    }
  }
}
