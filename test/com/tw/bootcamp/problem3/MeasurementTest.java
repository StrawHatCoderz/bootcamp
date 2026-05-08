package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void shouldCreateAFeetUnit() {
    Measurement ft = Measurement.create(1, "ft");
    assertEquals(Measurement.create(1, "ft"), ft);
  }

  @Test
  void shouldCreateAInchUnit() {
    Measurement in = Measurement.create(12, "in");
    assertEquals(Measurement.create(12, "in"), in);
  }

  @Test
  void shouldReturnABaseValueOfFeet() {
    Measurement ft = Measurement.create(1, "ft");
    Measurement in = Measurement.create(12, "in");
    assertEquals(ft.toInch(), in);
  }

}