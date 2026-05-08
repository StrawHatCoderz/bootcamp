package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

  @Test
  void shouldCreateAFeetUnit() throws InvalidMeasurementValue {
    Length ft = Length.create(1, Unit.FEET);
    assertEquals(Length.create(1, Unit.FEET), ft);
  }

  @Test
  void shouldCreateAInchUnit() throws InvalidMeasurementValue {
    Length in = Length.create(12, Unit.INCH);
    assertEquals(Length.create(12, Unit.INCH), in);
  }

  @Test
  void shouldThrowErrorOnInvalidMeasurement() throws InvalidMeasurementValue {
    assertThrows(
            InvalidMeasurementValue.class,
            () -> Length.create(-12, Unit.INCH)
    );
  }

  @Test
  void shouldCompareFeetWithItsInchValue() throws InvalidMeasurementValue {
    Length ft = Length.create(1, Unit.FEET);
    Length in = Length.create(12, Unit.INCH);
    assertEquals(ft, in);
  }

  @Test
  void shouldCompareCmWithItsInchValue() throws InvalidMeasurementValue {
    Length cm = Length.create(5, Unit.CENTIMETER);
    Length in = Length.create(2, Unit.INCH);
    assertEquals(cm, in);
  }

  @Test
  void shouldCompareMilliMeterWithItsCentiMeterValue() throws InvalidMeasurementValue {
    Length cm = Length.create(1, Unit.CENTIMETER);
    Length mm = Length.create(10, Unit.MILLIMETER);
    assertEquals(cm, mm);
  }

  @Test
  void shouldAddTwoValues() throws InvalidMeasurementValue {
    Length in = Length.create(2, Unit.INCH);
    Length result = Length.create(4, Unit.INCH);
    assertEquals(result, in.add(in) );
  }


}