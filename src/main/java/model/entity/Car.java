package model.entity;

import validation.Validation;

public class Car {

  private final String carName;
  private int movedDistance;

  public Car(String carName) {
    this.carName = carName;
    movedDistance = 0;
  }

  public int getMovedDistance() {
    return this.movedDistance;
  }

  public int setMovedDistance(int movedDistance) {
    this.movedDistance = movedDistance;
    return movedDistance;
  }

  public void moveDistance(int distance) {
    this.movedDistance ++;
  }

  public String getCarName() {
    return carName;
  }
}
