package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

  @Test
  void shouldCalculateOfOfGettingTailInCoin() {
    int totalFaces = 2;
    int tailAtLeastOnce = 1;
    double favourableOutcomes = (double) tailAtLeastOnce/ totalFaces;

    Probability probability = new Probability();
    assertEquals(0.5, probability.of(favourableOutcomes,
            1));
  }

  @Test
  void shouldCalculateOfOfGettingNotTailInCoin() {
    int totalFaces = 2;
    int tailAtLeastOnce = 1;
    double favourableOutcomes = (double) tailAtLeastOnce/ totalFaces;

    Probability probability = new Probability();
    assertEquals(0.5, probability.of(favourableOutcomes,
            1));
  }

  @Test
  void shouldCalculateOfOfGettingTailInCoinWhenTwoCoinsAreFlipped() {
    int totalFaces = 4;
    int tailAtLeastOnce = 3;
    double favourableOutcomes = (double) tailAtLeastOnce/ totalFaces;

    Probability probability = new Probability();
    assertEquals(0.75, probability.of(favourableOutcomes,
            1));
  }
}