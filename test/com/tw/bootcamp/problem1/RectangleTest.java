package com.tw.bootcamp.problem1;

import com.tw.bootcamp.problem1.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldCalculateAreaOfRectangleWithValidLengthAndBreadth() {
    Rectangle rectangle = new Rectangle(15,10);
    assertEquals(150, rectangle.calculateArea(), 0.0);
  }

  @Test
  void shouldCalculatePerimeterOfRectangleWithValidLengthAndBreadth() {
    Rectangle rectangle = new Rectangle(15,10);
    assertEquals(50, rectangle.calculatePerimeter(), 0.0);
  }
}