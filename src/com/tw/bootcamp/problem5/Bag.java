package com.tw.bootcamp.problem5;

import java.util.ArrayList;
import java.util.Objects;

public class Bag {

  private final int maxCapacity;
  private final ArrayList<Ball> balls;

  private Bag(int maxCapacity, ArrayList<Ball> balls) {
    this.maxCapacity = maxCapacity;
    this.balls = balls;
  }

  public static Bag create(int maxCapacity) {
    if (maxCapacity < 0) {
      throw new InvalidBagCreationError("Capacity should be positive");
    }

    return new Bag(maxCapacity, new ArrayList<Ball>());
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Bag bag = (Bag) o;
    return maxCapacity == bag.maxCapacity;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(maxCapacity);
  }

  public boolean add(Ball ball) {
    if (balls.size() >= maxCapacity) {
      return false;
    }

    balls.add(ball);
    return true;
  }
}
