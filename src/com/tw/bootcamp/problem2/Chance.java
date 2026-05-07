package com.tw.bootcamp.problem2;

import java.security.InvalidParameterException;

public class Chance {
  private final double value;
  private Chance(double value) {
    this.value = value;
  }

  public static Chance of(double value) {
    if (value < 0 || value > 1) {
      throw new InvalidParameterException("Chance should be less than 1 and " +
              "greater than 0");
    }

    return new Chance(value);
  }

  public Chance not() {
    return of(1 - this.value);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Chance chance = (Chance) o;
    return Double.compare(value, chance.value) == 0;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public Chance and(Chance anotherChance) {
    return of(this.value * anotherChance.value);
  }

  public Chance or(Chance anotherChance) {
    return of((this.value + anotherChance.value) - (this.value * anotherChance.value));
  }
}
