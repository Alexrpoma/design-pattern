package com.patterns.creational_patterns.factory_pattern;

public class ShipTransporting extends Transporting{
  @Override
  public Transport type() {
    return new Ship();
  }
}
