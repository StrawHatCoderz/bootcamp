package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {


  @Test
  void shouldCreateALiterUnit() throws InvalidMeasurementValue {
    Volume l = Volume.create(1, VolumeUnit.LITER);
    assertEquals(Volume.create(1, VolumeUnit.LITER), l);
  }

  @Test
  void shouldCompareGallonWithItsLitersValue() throws InvalidMeasurementValue {
    Volume gal = Volume.create(1, VolumeUnit.GALLON);
    Volume l = Volume.create(3.78, VolumeUnit.LITER);
    assertTrue(gal.equals(l));
  }

  @Test
  void shouldAddGallonWithLitersValue() throws InvalidMeasurementValue {
    Volume gal = Volume.create(1, VolumeUnit.GALLON);
    Volume l = Volume.create(1, VolumeUnit.LITER);

    Volume expected = Volume.create(4.78, VolumeUnit.LITER);
    assertEquals(expected, l.add(gal));
  }

}