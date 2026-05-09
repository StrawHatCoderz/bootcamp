package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Objects;

public class MultipleParkingLots {
  private final HashMap<Integer, ParkingLot> parkingLots;
  private final ParkingLotAssistant parkingLotAssistant;
  private final ParkingLotAttender parkingLotAttender;

  private MultipleParkingLots(HashMap<Integer, ParkingLot> parkingLots, ParkingLotAssistant parkingLotAssistant, ParkingLotAttender parkingLotAttender) {
    this.parkingLots = parkingLots;
    this.parkingLotAssistant = parkingLotAssistant;
    this.parkingLotAttender = parkingLotAttender;
  }

  public static MultipleParkingLots create(int countOfParkingLot,
                                           ParkingLot parkingLot,
                                           ParkingLotAssistant parkingLotAssistant,
                                           ParkingLotAttender parkingLotAttender
  ) {
    HashMap<Integer, ParkingLot> parkingLots = new HashMap<>();

    for (int i = 0; i < countOfParkingLot; i++) {
      parkingLots.put(i, parkingLot);
    }

    return new MultipleParkingLots(parkingLots,
            parkingLotAssistant, parkingLotAttender);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    MultipleParkingLots that = (MultipleParkingLots) o;
    return Objects.equals(parkingLots, that.parkingLots) && Objects.equals(parkingLotAssistant, that.parkingLotAssistant) && Objects.equals(parkingLotAttender, that.parkingLotAttender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parkingLots, parkingLotAssistant, parkingLotAttender);
  }

  public void display() {
    parkingLotAssistant.display(parkingLots);
  }

  public void park(Car car) {
    ParkingLot parkingLot = parkingLots.get(0);
    parkingLotAttender.park(car, parkingLot);
    parkingLotAssistant.update(parkingLot);
  }
}
