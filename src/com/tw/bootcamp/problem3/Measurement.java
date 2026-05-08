package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Measurement {
  private final double value;
  private final Unit unit;

  private Measurement(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Measurement create(double value, Unit unit) throws InvalidMeasurementValue {
    if (value < 0) {
      throw new InvalidMeasurementValue("Value should be positive");
    }
    return new Measurement(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Measurement that = (Measurement) o;
    return Double.compare(this.unit.toBase(this.value),
            that.unit.toBase(that.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}
