package com.tw.bootcamp.problem1.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldCalculateAreaOfRectangleWithValidLengthAndBreadth() {
    Rectangle rectangle = Rectangle.createRectangle(15,10);
    assertEquals(150, rectangle.area(), 0.0);
  }

  @Test
  void shouldCalculatePerimeterOfRectangleWithValidLengthAndBreadth() {
    Rectangle rectangle = Rectangle.createRectangle(15, 10);
    assertEquals(50, rectangle.perimeter(), 0.0);
  }

  @Test
  void shouldCalculateAreaOfSquareWithValidSide() {
    Rectangle square = Rectangle.createSquare(5);
    assertEquals(25, square.area(), 0.0);
  }

  @Test
  void shouldCalculatePerimeterOfSquareWithValidSide() {
    Rectangle square = Rectangle.createSquare(5);
    assertEquals(20, square.perimeter(), 0.0);
  }
}