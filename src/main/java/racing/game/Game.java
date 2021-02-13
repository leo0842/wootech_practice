package racing.game;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private List<Car> carsToRace;
  private int timesToPlay;
  private int currentTime;

  public Game(List<Car> carsToRace, int timesToPlay) {
    this.carsToRace = carsToRace;
    this.timesToPlay = timesToPlay;
    this.currentTime = 0;
  }

  public List<Car> getCarsToRace() {
    return this.carsToRace;
  }

  public boolean isInProgress() {
    return this.currentTime < this.timesToPlay;
  }

  public void nextRound() {
    List<Car> carsToRace = new ArrayList<>();
    for (Car car : this.carsToRace) {
      carsToRace.add(car.go());
    }
    this.carsToRace = carsToRace;
    this.currentTime++;
  }
}
