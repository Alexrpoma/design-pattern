package com.patterns.creational_patterns.factory_pattern;

public class Truck implements Transport{

  @Override
  public void deliver(int quantity, String packageType) {
    System.out.printf("Delivering: %s, Quantity: %d%n", packageType, quantity);
  }

  @Override
  public void cost(float weight) {
    System.out.printf("Total cost for %sKg: %d$%n", weight, Math.round((weight * 2.1)));
  }

  @Override
  public void maxLoadQuantity() {
    System.out.printf("Maximum weight: %dKg%n", 5000);
  }
}
