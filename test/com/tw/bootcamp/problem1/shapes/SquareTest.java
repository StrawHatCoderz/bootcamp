package com.tw.bootcamp.problem1.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
  @Test
  void shouldCalculateAreaOfSquareWithValidSide() {
    Square square = new Square(5);
    assertEquals(25, square.area(), 0.0);
  }

  @Test
  void shouldCalculatePerimeterOfSquareWithValidSide() {
    Square square = new Square(5);
    assertEquals(20, square.perimeter(), 0.0);
  }
}