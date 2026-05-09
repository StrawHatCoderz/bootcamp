package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLot {
  private final List<Slot> slots;
  private int nextEmptySlot;

  private ParkingLot(List<Slot> slots) {
    this.slots = slots;
    nextEmptySlot = 0;
  }

  public static ParkingLot create(int slotsCount) {
    ArrayList<Slot> slots = new ArrayList<>();
    for (int i = 0; i < slotsCount; i++) {
      slots.add(Slot.create());
    }

    return new ParkingLot(slots);
  }

  public void park(Car vehicle) {
    Slot slot = getNextEmptySlot();
    slot.occupy(vehicle);
  }

  private Slot getNextEmptySlot() {
    Slot slot = slots.get(nextEmptySlot);
    nextEmptySlot++;
    return slot;
  }

  public boolean isFull() {
    return slots.stream().allMatch(Slot::isOccupied);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ParkingLot that = (ParkingLot) o;
    return nextEmptySlot == that.nextEmptySlot && Objects.equals(slots, that.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slots, nextEmptySlot);
  }
}
