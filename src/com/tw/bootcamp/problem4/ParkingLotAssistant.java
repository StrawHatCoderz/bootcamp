package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Objects;

public class ParkingLotAssistant {
  private final String name;

  public ParkingLotAssistant(String name) {
    this.name = name;
  }

  public void display(HashMap<Integer, ParkingLot> parkingLots) {
    System.out.println("ALL PARKING LOTS");
  }

  public void update(ParkingLot parkingLot) {
    System.out.println("PARKING LOT UPDATED");
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ParkingLotAssistant that = (ParkingLotAssistant) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
