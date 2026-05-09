package com.tw.bootcamp.problem4;

import java.util.Objects;

public class Slot {
  private Car vehicle;

  public Slot() {
    Car vehicle = null;
  }

  public static Slot create() {
    return new Slot();
  }

  public void occupy(Car vehicle) {
    this.vehicle = vehicle;
  }

  public boolean isOccupied() {
    return vehicle != null;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Slot slot = (Slot) o;
    return Objects.equals(vehicle, slot.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(vehicle);
  }
}
