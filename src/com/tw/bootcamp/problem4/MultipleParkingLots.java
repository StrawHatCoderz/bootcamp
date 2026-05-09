package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Objects;

public class MultipleParkingLots {
  private final HashMap<Integer, ParkingLot> parkingLots;

  private MultipleParkingLots(HashMap<Integer, ParkingLot> parkingLots) {
    this.parkingLots = parkingLots;
  }

  public static MultipleParkingLots create(int countOfParkingLot) {
    HashMap<Integer, ParkingLot> parkingLots = new HashMap<>();

    for (int i = 0; i < countOfParkingLot; i++) {
      parkingLots.put(i, ParkingLot.create(20));
    }

    return new MultipleParkingLots(parkingLots);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    MultipleParkingLots that = (MultipleParkingLots) o;
    return Objects.equals(parkingLots, that.parkingLots);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(parkingLots);
  }
}
