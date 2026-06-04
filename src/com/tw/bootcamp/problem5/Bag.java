package com.tw.bootcamp.problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Bag {
  private final HashMap<Color, ArrayList<Ball>> balls;
  private final Rule rule;

  private Bag(HashMap<Color, ArrayList<Ball>> balls, Rule rule) {
    this.balls = balls;
    this.rule = rule;
  }

  public static Bag create(Rule rule) {
    return new Bag(new HashMap<Color, ArrayList<Ball>>(), rule);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Bag bag = (Bag) o;
    return Objects.equals(balls, bag.balls) && Objects.equals(rule, bag.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balls, rule);
  }

  public boolean add(Ball ball) {
    if (!rule.canAdd(ball.getColor(), balls)) {
      return false;
    }

    rule.updateCurrentCount();
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
