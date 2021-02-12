package racing;

import java.util.ArrayList;
import java.util.List;

public class Game {

  Racing racing = new Racing();

  List<Car> carsToRace = new ArrayList<>();

  public void addCars(String carList) {
    String[] cars = carList.split(",");
    for (String car : cars){
      carsToRace.add(new Car(car));
    }
  }

  public void raceStart(int timesToPlay) {
    for (int i = 0; i < timesToPlay; i++){
      racing.goStop(carsToRace);
      System.out.println("===============");
    }
  }

}
