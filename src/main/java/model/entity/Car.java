package model.entity;

public class Car {

  private final String carName;
  private int movedDistance;

  public Car(String carName) {
    this.carName = carName;
    movedDistance = 0;
  }

  private int getMovedDistance() {
    return this.movedDistance;
  }

  private int setMovedDistance(int movedDistance) {
    this.movedDistance = movedDistance;
    return movedDistance;
  }

  private void moveDistance(int distance) {
    this.movedDistance += distance;
  }

  public String getCarName() {
    return carName;
  }
}
