package racing.game;

public class Car {

  private final String name;
  private final int location;

  private Car(String name, int location) {
    this.name = name;
    this.location = location;
  }

  public Car(String name) {
    this(name, 0);
  }

  public Car go() {
    int randomInt = (int) (Math.random() * 10);
    if (randomInt > 3) {
      return new Car(this.name, this.location + 1);
    }
    return this;
  }

  public String getName() {
    return name;
  }

  public int getLocation() {
    return location;
  }
}
