package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
  private final double value;
  private final Unit unit;

  public Volume(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Volume create(double value, Unit unit) throws InvalidMeasurementValue {
    if (value < 0) {
      throw new InvalidMeasurementValue("Value should be positive");
    }

    return new Volume(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Volume that = (Volume) o;
    return Double.compare(this.unit.toBase(this.value),
            that.unit.toBase(that.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

}
