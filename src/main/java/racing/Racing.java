package racing;

import java.util.List;

public class Racing {

  public void goStop(List<Car> carsToRace) {

    for (Car car : carsToRace) {
      int randomInt = (int) (Math.random() * 10);
      if (randomInt > 3) {
        car.go();
        System.out.println(car.getName());
      }
    }
  }
}
