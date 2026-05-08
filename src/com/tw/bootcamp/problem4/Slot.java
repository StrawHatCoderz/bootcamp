package com.tw.bootcamp.problem4;

public class Slot {
  private String vehicle;

  public Slot() {
    String vehicle = null;
  }

  public static Slot create() {
    return new Slot();
  }

  public void occupy(String vehicle) {
    this.vehicle = vehicle;
  }

  public boolean isOccupied() {
    return vehicle != null;
  }
}
