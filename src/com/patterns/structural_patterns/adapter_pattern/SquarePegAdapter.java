package com.patterns.structural_patterns.adapter_pattern;

public class SquarePegAdapter implements Round {

  private final SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    this.squarePeg = squarePeg;
  }

  @Override
  public double getRadius() {
    return Math.sqrt(2 * Math.pow(squarePeg.side(), 2)); //Pythagoras theorem
  }

  @Override
  public double getArea() {
    return Math.pow(squarePeg.side(), 2);
  }
}
