package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void shouldCreateAFeetUnit() throws InvalidMeasurementValue {
    Measurement ft = Measurement.create(1, "ft");
    assertEquals(Measurement.create(1, "ft"), ft);
  }

  @Test
  void shouldCreateAInchUnit() throws InvalidMeasurementValue {
    Measurement in = Measurement.create(12, "in");
    assertEquals(Measurement.create(12, "in"), in);
  }

  @Test
  void shouldThrowErrorOnInvalidMeasurement() throws InvalidMeasurementValue {
    assertThrows(
            InvalidMeasurementValue.class,
            () -> Measurement.create(-12, "in")
    );
  }

  @Test
  void shouldCompareFeetWithItsInchValue() throws InvalidMeasurementValue {
    Measurement ft = Measurement.create(1, "ft");
    Measurement in = Measurement.create(12, "in");
    assertEquals(ft.toBase(), in.toBase());
  }

  @Test
  void shouldCompareCmWithItsInchValue() throws InvalidMeasurementValue {
    Measurement cm = Measurement.create(5, "cm");
    Measurement in = Measurement.create(2, "in");
    assertEquals(cm.toBase(), in.toBase());
  }
}