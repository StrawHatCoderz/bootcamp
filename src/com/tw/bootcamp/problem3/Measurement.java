package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Measurement {
  private final double value;
  private final String unit;

  public Measurement(double value, String unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Measurement create(double value, String unit) {
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
}
