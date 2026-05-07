package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void chanceOfGettingTailWithOneCoin() {
    Chance chanceOfGettingTails = Chance.of(0.5);
    assertEquals(new Chance(0.5), chanceOfGettingTails);
  }

  @Test
  void chanceOfGettingTailWithOneCoinPassingInvalidValue() {
    assertThrows(
            InvalidParameterException.class,
            () -> Chance.of(1.5)
    );
    assertThrows(
            InvalidParameterException.class,
            () -> Chance.of(-1)
    );
  }

  @Test
  void chanceOfGettingNotTailWithOneCoin() {
    Chance chanceOfGettingNotATail = Chance.of(0.5).not();
    assertEquals(new Chance(0.5), chanceOfGettingNotATail);
  }

  @Test
  void chanceOfGettingOnlyTailWithTwoCoins() {
    Chance chanceOfGettingTwoTails = Chance.of(0.5).and(Chance.of(0.5));
    assertEquals(new Chance(0.25), chanceOfGettingTwoTails);
  }

  @Test
  void chanceOfGettingThreeOnADice() {
    Chance chanceOfGettingThree = Chance.of(0.166);
    assertEquals(new Chance(0.166), chanceOfGettingThree);
  }

  @Test
  void chanceOfGettingAtLeastOneTailWithTwoCoins() {
    Chance chanceOfGettingAtLeastOneTail = Chance.of(0.5).or(Chance.of(0.5));

    assertEquals(new Chance(0.75), chanceOfGettingAtLeastOneTail);
  }
}