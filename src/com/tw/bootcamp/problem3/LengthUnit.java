package com.tw.bootcamp.problem3;

public enum LengthUnit {
  FEET(12),
  CENTIMETER(0.4),
  INCH(1),
  MILLIMETER(0.04),
  GALLON(3.78),
  LITER(1);

  private final double baseValue;

  LengthUnit(double baseValue) {
    this.baseValue = baseValue;
  }
  
  public double toBase(double value) {
    return value * this.baseValue;
  }
}
