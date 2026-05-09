package com.tw.bootcamp.problem5;

public enum Color {
  BLUE(12),
  GREEN(3),
  RED(0),
  YELLOW(12);

  private final int maxCount;
  private int currentCount = 0;

  Color(int maxCount) {
    this.maxCount = maxCount;
  }

  public int getMaxCount() {
    if (this == RED) {
      return GREEN.currentCount * 2;
    }
    return maxCount;
  }

  public boolean canAdd() {
    return this.currentCount < getMaxCount();
  }

  public void incrementCurrentCount() {
    this.currentCount++;
  }
}