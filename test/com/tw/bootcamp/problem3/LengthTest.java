package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

  @Test
  void shouldCreateAFeetUnit() throws InvalidMeasurementValue {
    Length ft = Length.create(1, LengthUnit.FEET);
    assertEquals(Length.create(1, LengthUnit.FEET), ft);
  }

  @Test
  void shouldCreateAInchUnit() throws InvalidMeasurementValue {
    Length in = Length.create(12, LengthUnit.INCH);
    assertEquals(Length.create(12, LengthUnit.INCH), in);
  }

  @Test
  void shouldThrowErrorOnInvalidMeasurement() throws InvalidMeasurementValue {
    assertThrows(
            InvalidMeasurementValue.class,
            () -> Length.create(-12, LengthUnit.INCH)
    );
  }

  @Test
  void shouldCompareFeetWithItsInchValue() throws InvalidMeasurementValue {
    Length ft = Length.create(1, LengthUnit.FEET);
    Length in = Length.create(12, LengthUnit.INCH);
    assertEquals(ft, in);
  }

  @Test
  void shouldCompareCmWithItsInchValue() throws InvalidMeasurementValue {
    Length cm = Length.create(5, LengthUnit.CENTIMETER);
    Length in = Length.create(2, LengthUnit.INCH);
    assertEquals(cm, in);
  }

  @Test
  void shouldCompareMilliMeterWithItsCentiMeterValue() throws InvalidMeasurementValue {
    Length cm = Length.create(1, LengthUnit.CENTIMETER);
    Length mm = Length.create(10, LengthUnit.MILLIMETER);
    assertEquals(cm, mm);
  }

  @Test
  void shouldAddTwoValues() throws InvalidMeasurementValue {
    Length in = Length.create(2, LengthUnit.INCH);
    Length result = Length.create(4, LengthUnit.INCH);
    assertEquals(result, in.add(in) );
  }

  @Test
  void shouldAddTwoDifferentLengths() throws InvalidMeasurementValue {
    Length in = Length.create(2, LengthUnit.INCH);
    Length cm = Length.create(2.5, LengthUnit.CENTIMETER);

    Length expected = Length.create(3, LengthUnit.INCH);
    assertEquals(expected, in.add(cm));
  }
}