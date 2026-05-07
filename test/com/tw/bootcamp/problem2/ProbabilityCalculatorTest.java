package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityCalculatorTest {

  @Test
  void shouldCalculateProbabilityOfGettingTailInCoin() {
    ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator();
    assertEquals(0.5, probabilityCalculator.probability(0.5, 1));
  }

  @Test
  void shouldCalculateProbabilityOfGettingTailWhenFlippedTwoTimes() {
    ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator();
    assertEquals(0.25, probabilityCalculator.probability(0.5, 2));
  }
}