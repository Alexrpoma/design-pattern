package com.patterns.creational_patterns.factory_pattern;

public class TransportFactory {

  private static Transporting transporting;

  public static Transport build(String transportType) {
    if (transportType.equals("Truck")) {
      transporting = new TruckTransporting();
    }
    else if (transportType.equals("Ship")) {
      transporting = new ShipTransporting();
    }
    else {
      throw new IllegalArgumentException("Transport %s type doesn't exist!".formatted(transportType));
    }
    return transporting.type();
  }
}
