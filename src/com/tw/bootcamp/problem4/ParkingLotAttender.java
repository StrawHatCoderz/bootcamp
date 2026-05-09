package com.tw.bootcamp.problem4;

import java.util.Objects;

public class ParkingLotAttender {
  private final String name;

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ParkingLotAttender that = (ParkingLotAttender) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }

  public ParkingLotAttender(String name) {
    this.name = name;
  }

  public void park(Car car, ParkingLot parkingLot) {
    parkingLot.park(car);
  }
}
