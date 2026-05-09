package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Objects;

public class MultipleParkingLots {
  private final HashMap<Integer, ParkingLot> parkingLots;
  private final ParkingLot parkingLotProvider;

  private MultipleParkingLots(HashMap<Integer, ParkingLot> parkingLots, ParkingLot parkingLot) {
    this.parkingLotProvider = parkingLot;
    this.parkingLots = parkingLots;
  }

  public static MultipleParkingLots create(int countOfParkingLot,
                                           ParkingLot parkingLot) {
    HashMap<Integer, ParkingLot> parkingLots = new HashMap<>();

    for (int i = 0; i < countOfParkingLot; i++) {
      parkingLots.put(i, parkingLot);
    }

    return new MultipleParkingLots(parkingLots, parkingLot);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    MultipleParkingLots that = (MultipleParkingLots) o;
    return Objects.equals(parkingLots, that.parkingLots) && Objects.equals(parkingLotProvider, that.parkingLotProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parkingLots, parkingLotProvider);
  }
}
