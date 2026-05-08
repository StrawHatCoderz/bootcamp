package com.tw.bootcamp.problem3;

public class Temperature {
  private final double value;
  private final TemperatureUnit tempUnit;

  public Temperature(double value, TemperatureUnit temperatureUnit) {
    this.value = value;
    this.tempUnit = temperatureUnit;
  }

  public static Temperature create(double value, TemperatureUnit unit) {
    return new Temperature(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Temperature that = (Temperature) o;
    return Double.compare(this.toCelsius(this.value),
            that.toCelsius(that.value)) == 0;
  }

  public double toCelsius(double value) {
    if (this.tempUnit == TemperatureUnit.CELSIUS) {
      return value;
    }

    return (value - 32) / 1.8;
  }
}
