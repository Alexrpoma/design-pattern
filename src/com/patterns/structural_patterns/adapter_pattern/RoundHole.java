package com.patterns.structural_patterns.adapter_pattern;

public record RoundHole(double radius) {

  public boolean fits(Round round) {
    return radius >= round.getRadius();
  }
}
