package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void shouldCreateAFeetUnit() {
    Measurement ft = Measurement.create(1, "ft");
    assertEquals(Measurement.create(1, "ft"), ft);
  }

}