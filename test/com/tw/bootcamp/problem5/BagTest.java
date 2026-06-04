package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  @Test
  void shouldCreateABag() {
    Rule rule = Rule.create(12);
    Bag bag = Bag.create(rule);
    assertEquals(bag, Bag.create(rule));
  }

  @Test
  void shouldThrowErrorOnInvalidCapacity() {
    assertThrows(InvalidBagCreationError.class, () -> Rule.create(-12));
  }

  @Test
  void shouldAddABallToBag() {
    Rule rule = Rule.create(12);
    Bag bag = Bag.create(rule);
    assertFalse(bag.add(Ball.create(Color.RED)));
  }

  @Test
  void shouldNotAddAfterExceedingCapacity() {
    Rule rule = Rule.create(1);
    Bag bag = Bag.create(rule);
    bag.add(Ball.create(Color.BLUE));
    assertFalse(bag.add(Ball.create(Color.BLUE)));
  }

  @Test
  void shouldNotAddMoreThanThreeGreen() {
    Rule rule = Rule.create(12);
    Bag bag = Bag.create(rule);
    bag.add(Ball.create(Color.GREEN));
    bag.add(Ball.create(Color.GREEN));
    bag.add(Ball.create(Color.GREEN));

    assertFalse(bag.add(Ball.create(Color.GREEN)));
  }

  @Test
  void shouldNotAddRedMoreThanGreenDouble() {
    Rule rule = Rule.create(12);
    Bag bag = Bag.create(rule);
    bag.add(Ball.create(Color.GREEN));
    bag.add(Ball.create(Color.RED));
    bag.add(Ball.create(Color.RED));

    assertFalse(bag.add(Ball.create(Color.RED)));
  }
}