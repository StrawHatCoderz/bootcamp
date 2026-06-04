package com.tw.bootcamp.problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Rule {
  private final int maxCapacity;
  private int currentCount;

  public Rule(int maxCapacity) {
    this.maxCapacity = maxCapacity;
    this.currentCount = 0;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Rule rule = (Rule) o;
    return maxCapacity == rule.maxCapacity && currentCount == rule.currentCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCapacity, currentCount);
  }

  public boolean canAdd(Color color,
                        HashMap<Color, ArrayList<Ball>> balls) {
    if (currentCount >= maxCapacity) {
      return false;
    }

    if (color != Color.RED && !balls.containsKey(color)) {
      return true;
    }

    if (color == Color.GREEN) {
      return balls.get(Color.GREEN).size() < 3;
    }

    if (color == Color.RED) {
      if (!balls.containsKey(Color.GREEN)) {
        return false;
      }

      int redBallCount = balls.get(Color.RED).size();
      int greenBallCount = balls.get(Color.GREEN).size();

      return redBallCount < greenBallCount * 2;
    }

    if (color == Color.YELLOW) {
      return balls.get(Color.YELLOW).size() < currentCount * 0.4;
    }

    return true;
  }

  public static Rule create(int maxCapacity) {
    if (maxCapacity < 0) {
      throw new InvalidBagCreationError("Capacity should be positive");
    }

    return new Rule(maxCapacity);
  }

  public void updateCurrentCount() {
    currentCount = currentCount + 1;
  }
}
