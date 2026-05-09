package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  @Test
  void shouldCreateABag() {
    Bag bag = Bag.create(12);
    assertEquals(bag, Bag.create(12));
  }

  @Test
  void shouldThrowErrorOnInvalidCapacity() {
    assertThrows(InvalidBagCreationError.class, () -> Bag.create(-12));
  }

  @Test
  void shouldAddABallToBag() {
    Bag bag = Bag.create(12);
    assertTrue(bag.add(new Ball("black")));
  }

  @Test
  void shouldNotAddAfterExceedingCapacity() {
    Bag bag = Bag.create(1);
    bag.add(new Ball("black"));
    assertFalse(bag.add(new Ball("black")));
  }
}