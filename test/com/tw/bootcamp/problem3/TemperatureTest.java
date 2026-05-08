package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {
  @Test
  void shouldCreateCelsius() {
    Temperature celsius = Temperature.create(100, TemperatureUnit.CELSIUS);
    assertEquals(Temperature.create(100, TemperatureUnit.CELSIUS), celsius);
  }

  @Test
  void shouldCompareCelsiusWithFahrenheit() {
    Temperature celsius = Temperature.create(100, TemperatureUnit.CELSIUS);
    Temperature fahrenheit = Temperature.create(212, TemperatureUnit.FAHRENHEIT);

    assertEquals(fahrenheit, celsius);
  }

}