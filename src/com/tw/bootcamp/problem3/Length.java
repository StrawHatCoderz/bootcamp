package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
  private final double value;
  private final Unit unit;

  Length(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Length create(double value, Unit unit) throws InvalidMeasurementValue {
    if (value < 0) {
      throw new InvalidMeasurementValue("Value should be positive");
    }

    return new Length(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Length that = (Length) o;
    return Double.compare(this.unit.toBase(this.value),
            that.unit.toBase(that.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}
