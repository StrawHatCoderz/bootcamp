package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldParkACar() {
    ParkingLot parkingLot = ParkingLot.create(1);
    parkingLot.park("C");
    assertTrue(parkingLot.isFull());
  }
}