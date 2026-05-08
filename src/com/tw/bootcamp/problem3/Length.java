package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit lengthUnit;

  Length(double value, LengthUnit lengthUnit) {
    this.value = value;
    this.lengthUnit = lengthUnit;
  }

  public static Length create(double value, LengthUnit lengthUnit) throws InvalidMeasurementValue {
    if (value < 0) {
      throw new InvalidMeasurementValue("Value should be positive");
    }

    return new Length(value, lengthUnit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Length that = (Length) o;
    return Double.compare(this.lengthUnit.toBase(this.value),
            that.lengthUnit.toBase(that.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, lengthUnit);
  }

  public Length add(Length other) {
    double lengthUnitBase = this.lengthUnit.toBase(this.value);
    double otherLengthUnitBase = other.lengthUnit.toBase(other.value);
    return new Length(otherLengthUnitBase + lengthUnitBase, this.lengthUnit);
  }
}
