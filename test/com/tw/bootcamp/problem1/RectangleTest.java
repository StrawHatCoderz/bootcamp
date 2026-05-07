package com.tw.bootcamp.problem1;

import com.tw.bootcamp.problem1.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldCalculateAreaOfRectangleWithValidLengthAndBreadth() {
    Rectangle rectangle = new Rectangle(10,10);
    assertEquals(100, rectangle.calculateArea(), 0.0);
  }
}