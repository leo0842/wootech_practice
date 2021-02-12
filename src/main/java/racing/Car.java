package racing;

import java.util.ArrayList;
import java.util.List;

public class Car {

  private String name;

  private int location = 0;

  public Car(String car) {
    name = car;
  }

  public String[] carSplit(String carList){
    return carList.split(",");
  }

  public void go(){
    location++;
  }

  public String getName() {
    return name;
  }

  public int getLocation() {
    return location;
  }
}
