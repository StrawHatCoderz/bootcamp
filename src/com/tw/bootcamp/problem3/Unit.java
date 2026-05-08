package com.tw.bootcamp.problem3;

public enum Unit {
  FEET(12),
  CENTIMETER(0.4),
  INCH(1),
  ;

  private final double baseValue;

  Unit(double baseValue) {
    this.baseValue = baseValue;
  }
  
  public double toBase(double value) {
    return value * this.baseValue;
  }
}
