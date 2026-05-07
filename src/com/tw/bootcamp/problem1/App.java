package com.tw.bootcamp.problem1;

import com.tw.bootcamp.problem1.shapes.Rectangle;

public class App {
  static void main() {
    Rectangle rectangle = new Rectangle(15, 10);
    System.out.println(rectangle.area());
    System.out.println(rectangle.perimeter());
  }
}
