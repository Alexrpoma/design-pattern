package com.patterns.structural_patterns.adapter_pattern;

public class RoundPeg implements Round {

  private final double radius;

  public RoundPeg(double radius) {
    this.radius = radius;
  }

  @Override
  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
