package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MultipleParkingLotsTest {
  @Test
  void shouldCreateMultipleParkingLots() {
    MultipleParkingLots multipleParkingLots = MultipleParkingLots.create(2,
            ParkingLot.create(10), new ParkingLotAssistant("BOB"),
            new ParkingLotAttender("JACK"));
    assertEquals(multipleParkingLots, MultipleParkingLots.create(2,
            ParkingLot.create(10), new ParkingLotAssistant("BOB"),
            new ParkingLotAttender("JACK")));
  }

  @Test
  void shouldEnsureCarIsParked() {
    ParkingLotAssistant parkingLotAssistant = mock(ParkingLotAssistant.class);
    ParkingLotAttender parkingLotAttender = mock(ParkingLotAttender.class);

    ParkingLot parkingLot = ParkingLot.create(10);

    MultipleParkingLots multipleParkingLots = MultipleParkingLots.create(
            2,
            parkingLot,
            parkingLotAssistant,
            parkingLotAttender
    );

    Car car = new Car("BH47");

    multipleParkingLots.park(car);

    verify(parkingLotAttender).park(car, parkingLot);
    verify(parkingLotAssistant).update(parkingLot);
  }

  @Test
  void shouldAttendsGetOnlySlotsAvailableParkingLot() {
    ParkingLotAssistant parkingLotAssistant = mock(ParkingLotAssistant.class);
    ParkingLotAttender parkingLotAttender = mock(ParkingLotAttender.class);
    ParkingLotManager parkingLotManager = mock(ParkingLotManager.class);

    ParkingLot parkingLot = ParkingLot.create(10);

    MultipleParkingLots multipleParkingLots = MultipleParkingLots.create(
            2,
            parkingLot,
            parkingLotAssistant,
            parkingLotAttender
    );

    Car car = new Car("BH47");

    multipleParkingLots.park(car);

    verify(parkingLotAttender).park(car, parkingLot);
    verify(parkingLotAssistant).update(parkingLot);
  }
}