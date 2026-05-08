package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Measurement {
  private final double value;
  private final Unit unit;

  public Measurement(double value, Unit unit) {
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
    return Double.compare(value, that.value) == 0 && Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  public Measurement toBase() {
    return new Measurement(this.unit.toBase(this.value), Unit.INCH);
  }
}
