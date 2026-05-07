package com.tw.bootcamp.problem2;

public class App {
  static void main() {
    System.out.println("Chance of Getting Tail with one coin:" + Chance.of(0.50));
    System.out.println("Chance of Getting Not Tail with one coin:" + Chance.of(0.50).not());
    System.out.println("Chance of Getting Only Tails with two coins:" + Chance.of(0.50).and(Chance.of(0.50)));
    System.out.println("Chance of Getting Three on one Dice:" + Chance.of(0.166));
  System.out.println("Chance of Getting AtLeast ne Tail with two coins:" + Chance.of(0.50).or(Chance.of(0.50)));
  }
}
