package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnit volumeUnit;

  public Volume(double value, VolumeUnit volumeUnit) {
    this.value = value;
    this.volumeUnit = volumeUnit;
  }

  public static Volume create(double value, VolumeUnit volumeUnit) throws InvalidMeasurementValue {
    if (value < 0) {
      throw new InvalidMeasurementValue("Value should be positive");
    }

    return new Volume(value, volumeUnit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Volume that = (Volume) o;
    return Math.abs(this.volumeUnit.toBase(this.value) - that.volumeUnit.toBase(that.value)) < 0.1;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, volumeUnit);
  }

  public Volume add(Volume other) {
    double volumeUnitBase = this.volumeUnit.toBase(this.value);
    double otherVolumeUnitBase = other.volumeUnit.toBase(other.value);

    return new Volume(otherVolumeUnitBase + volumeUnitBase, this.volumeUnit);
  }
}
