package com.patterns.factory_pattern;

public class App {
  public static void main(String[] args) {
    Transport road = TransportFactory.build("Truck");
    road.cost(500);
    road.deliver(23, "tables");
    road.message();
    road.maxLoadQuantity();
  }
}
