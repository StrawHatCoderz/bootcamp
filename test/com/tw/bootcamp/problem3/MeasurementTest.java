package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void shouldCreateAFeetUnit() throws InvalidMeasurementValue {
    Measurement ft = Measurement.create(1, Unit.FEET);
    assertEquals(Measurement.create(1, Unit.FEET), ft);
  }

  @Test
  void shouldCreateAInchUnit() throws InvalidMeasurementValue {
    Measurement in = Measurement.create(12, Unit.INCH);
    assertEquals(Measurement.create(12, Unit.INCH), in);
  }

  @Test
  void shouldThrowErrorOnInvalidMeasurement() throws InvalidMeasurementValue {
    assertThrows(
            InvalidMeasurementValue.class,
            () -> Measurement.create(-12, Unit.INCH)
    );
  }

  @Test
  void shouldCompareFeetWithItsInchValue() throws InvalidMeasurementValue {
    Measurement ft = Measurement.create(1, Unit.FEET);
    Measurement in = Measurement.create(12, Unit.INCH);
    assertTrue(ft.equals(in));
  }

  @Test
  void shouldCompareCmWithItsInchValue() throws InvalidMeasurementValue {
    Measurement cm = Measurement.create(5, Unit.CENTIMETER);
    Measurement in = Measurement.create(2, Unit.INCH);
    assertTrue(cm.equals(in));
  }

  @Test
  void shouldCompareMilliMeterWithItsCentiMeterValue() throws InvalidMeasurementValue {
    Measurement cm = Measurement.create(1, Unit.CENTIMETER);
    Measurement mm = Measurement.create(10, Unit.MILLIMETER);
    assertTrue(cm.equals(mm));
  }

  @Test
  void shouldCompareGallonWithItsLitersValue() throws InvalidMeasurementValue {
    Measurement gal = Measurement.create(1, Unit.GALLON);
    Measurement l = Measurement.create(3.78, Unit.LITER);
    assertTrue(gal.equals(l));
  }
}