package com.tw.bootcamp.problem1.shapes;

public class Rectangle {

  private final double length;
  private final double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double calculateArea() {
    return length * breadth;
  }
}
