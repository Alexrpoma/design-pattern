package com.patterns.factory_pattern;

public class TruckTransporting extends Transporting{
  @Override
  public Transport type() {
    return new Truck();
  }
}
