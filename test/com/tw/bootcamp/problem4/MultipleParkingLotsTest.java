package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleParkingLotsTest {
  @Test
  void shouldCreateMultipleParkingLots() {
    MultipleParkingLots multipleParkingLots = MultipleParkingLots.create(2);
    assertEquals(multipleParkingLots, MultipleParkingLots.create(2));
  }
}