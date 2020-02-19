package com.oop_pub.exceptions.ex2_3;

import java.util.Collection;

public class DoubleCalculator implements Calculator {
  private void nullParam(Double nr) {
    if (nr == null) {
      throw new NullParameterException();
    }
  }

  private void nullParam(Double nr1, Double nr2) {
    if (nr1 == null || nr2 == null) {
      throw new NullParameterException();
    }
  }

  @Override
  public Double add(Double nr1, Double nr2) {
    nullParam(nr1, nr2);
    if (nr1 + nr2 == Double.NEGATIVE_INFINITY) {
      throw new UnderflowException();
    }
    if (nr1 + nr2 == Double.POSITIVE_INFINITY) {
      throw new OverflowException();
    }
    return nr1 + nr2;
  }

  @Override
  public Double divide(Double nr1, Double nr2) {
    nullParam(nr1, nr2);
    if (nr1 / nr2 == Double.NEGATIVE_INFINITY) {
      throw new UnderflowException();
    }
    if (nr1 / nr2 == Double.POSITIVE_INFINITY) {
      throw new OverflowException();
    }
    return nr1 / nr2;
  }

  @Override
  public Double average(Collection<Double> numbers) {
    Double sum = 0d;
    for (Double number : numbers) {
      nullParam(number);
      sum = add(sum, number);
    }
    return divide(sum, (double) numbers.size());
  }
}
