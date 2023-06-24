package com.patterns.factory_pattern;

public class App {
  public static void main(String[] args) {
    Transport road = TransportFactory.build("Truck");
    road.cost(500);
    road.deliver(23, "tables");
    road.message();
    road.maxLoadQuantity();

    System.out.println();
    Transport sea = TransportFactory.build("Ship");
    sea.cost(1560);
    sea.deliver(100, "Car components");
    sea.message();
    road.maxLoadQuantity();
  }
}
