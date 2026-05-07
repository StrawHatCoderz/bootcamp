package com.tw.bootcamp.problem2;

import java.security.InvalidParameterException;

public class ImpossibleChanceError extends InvalidParameterException {

  public ImpossibleChanceError(String errorMessage) {
    super(errorMessage);
  }
}
