package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void chanceOfGettingTailWithOneCoin() {
    Chance chanceOfGettingTails = Chance.of(0.5);
    assertEquals("0.5", chanceOfGettingTails.toString());
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
    assertEquals("0.5", chanceOfGettingNotATail.toString());
  }

  @Test
  void chanceOfGettingOnlyTailWithTwoCoins() {
    Chance chanceOfGettingTwoTails = Chance.of(0.5).and(Chance.of(0.5));
    assertEquals("0.25", chanceOfGettingTwoTails.toString());
  }

  @Test
  void chanceOfGettingThreeOnADice() {
    Chance chanceOfGettingThree = Chance.of(0.166);
    assertEquals("0.166", chanceOfGettingThree.toString());
  }

  @Test
  void chanceOfGettingAtLeastOneTailWithTwoCoins() {
    Chance chanceOfGettingAtLeastOneTail = Chance.of(0.5).or(Chance.of(0.5));

    assertEquals("0.75", chanceOfGettingAtLeastOneTail.toString());
  }
}