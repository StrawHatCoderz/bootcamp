package com.tw.bootcamp.problem5;

public class Ball {
  private final Color color;

  private Ball(Color color) {
    this.color = color;
  }

  public static Ball create(Color color) {
    return new Ball(color);
  }

  public Color getColor() {
    return this.color;
  }
}
