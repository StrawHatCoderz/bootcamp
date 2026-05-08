package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {


  @Test
  void shouldCreateALiterUnit() throws InvalidMeasurementValue {
    Volume l = Volume.create(1, Unit.LITER);
    assertEquals(Volume.create(1, Unit.LITER), l);
  }

  @Test
  void shouldCompareGallonWithItsLitersValue() throws InvalidMeasurementValue {
    Volume gal = Volume.create(1, Unit.GALLON);
    Volume l = Volume.create(3.78, Unit.LITER);
    assertTrue(gal.equals(l));
  }

}