package com.tw.bootcamp.problem4;

import java.util.Objects;

public class Car {
  private final String numberPlate;

  public Car(String numberPlate) {
    this.numberPlate = numberPlate;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return Objects.equals(numberPlate, car.numberPlate);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(numberPlate);
  }
}
