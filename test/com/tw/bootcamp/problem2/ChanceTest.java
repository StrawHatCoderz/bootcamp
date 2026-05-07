package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void chanceOfGettingTailWithOneCoin() {
    Chance chanceOfGettingTails = Chance.of(0.5);
    assertEquals(new Chance(0.5), chanceOfGettingTails);
  }

  @Test
  void chanceOfGettingNotTailWithOneCoin() {
    Chance chanceOfGettingNotATail = Chance.of(0.5).not();
    assertEquals(new Chance(0.5), chanceOfGettingNotATail);
  }

  @Test
  void chanceOfGettingTailWithTwoCoins() {
    Chance chanceOfGettingTails = Chance.of(0.5);
    assertEquals(new Chance(0.5), chanceOfGettingTails);
  }

  @Test
  void chanceOfGettingThreeOnADice() {
    Chance chanceOfGettingThree = Chance.of(0.166);
    assertEquals(new Chance(0.166), chanceOfGettingThree);
  }
}