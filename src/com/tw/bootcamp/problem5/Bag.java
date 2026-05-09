package com.tw.bootcamp.problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Bag {

  private final int maxCapacity;
  private final HashMap<Color, ArrayList<Ball>> balls;
  private int capacity;

  private Bag(int maxCapacity, HashMap<Color, ArrayList<Ball>> balls) {
    this.maxCapacity = maxCapacity;
    this.balls = balls;
    this.capacity = 0;
  }

  public static Bag create(int maxCapacity) {
    if (maxCapacity < 0) {
      throw new InvalidBagCreationError("Capacity should be positive");
    }

    return new Bag(maxCapacity, new HashMap<Color, ArrayList<Ball>>());
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Bag bag = (Bag) o;
    return maxCapacity == bag.maxCapacity && Objects.equals(balls, bag.balls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCapacity, balls);
  }

  public boolean add(Ball ball) {
    if (capacity >= maxCapacity) {
      return false;
    }

    if (!ball.getColor().canAdd()) {
      return false;
    }

    capacity = capacity + 1;
    organizeBall(ball);
    return true;
  }

  private void organizeBall(Ball ball) {
    Color color = ball.getColor();

    if (!balls.containsKey(color)) {
      balls.put(color, new ArrayList<>());
    }

    color.incrementCurrentCount();
    balls.get(color).add(ball);
  }
}
