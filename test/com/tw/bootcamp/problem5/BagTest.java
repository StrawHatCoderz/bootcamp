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
    assertTrue(bag.add(Ball.create(Color.BLUE)));
  }

  @Test
  void shouldNotAddAfterExceedingCapacity() {
    Bag bag = Bag.create(1);
    bag.add(Ball.create(Color.BLUE));
    assertFalse(bag.add(Ball.create(Color.BLUE)));
  }

  @Test
  void shouldNotAddMoreThanThreeGreen() {
    Bag bag = Bag.create(12);
    bag.add(Ball.create(Color.GREEN));
    bag.add(Ball.create(Color.GREEN));
    bag.add(Ball.create(Color.GREEN));

    assertFalse(bag.add(Ball.create(Color.GREEN)));
  }

  @Test
  void shouldNotAddRedMoreThanGreenDouble() {
    Bag bag = Bag.create(12);
    bag.add(Ball.create(Color.GREEN));
    bag.add(Ball.create(Color.RED));
    bag.add(Ball.create(Color.RED));

    assertFalse(bag.add(Ball.create(Color.RED)));
  }
}