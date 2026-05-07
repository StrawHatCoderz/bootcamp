package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void chanceOfGettingTailWithOneCoin() {
    int totalFaces = 2;
    int tailAtLeastOnce = 1;
    double favourableOutcomes = (double) tailAtLeastOnce/ totalFaces;

    Chance chance = new Chance();
    assertEquals(0.5, chance.of(favourableOutcomes,
            1));
  }

  @Test
  void chanceOfGettingNotTailWithOneCoin() {
    int totalFaces = 2;
    int tailAtLeastOnce = 1;
    double favourableOutcomes = 1 - (double) tailAtLeastOnce/ totalFaces;

    Chance chance = new Chance();
    assertEquals(0.5, chance.of(favourableOutcomes,
            1));
  }

  @Test
  void chanceOfGettingTailWithTwoCoins() {
    int totalFaces = 4;
    int tailAtLeastOnce = 3;
    double favourableOutcomes = (double) tailAtLeastOnce/ totalFaces;

    Chance chance = new Chance();
    assertEquals(0.75, chance.of(favourableOutcomes,
            1));
  }

  @Test
  void chanceOfGettingThreeOnADice() {
    int totalFaces = 6;
    int tailAtLeastOnce = 1;
    double favourableOutcomes = (double) tailAtLeastOnce/ totalFaces;

    Chance chance = new Chance();
    assertEquals(0.16, chance.of(favourableOutcomes,
            1), 0.1);
  }
}