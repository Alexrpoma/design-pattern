package com.patterns.factory_pattern;

public class Ship implements Transport{
  @Override
  public void deliver(int quantity, String packageType) {
    System.out.printf("Delivering: %s, Quantity: %d%n", packageType, quantity);
  }

  @Override
  public void cost(float weight) {
    System.out.printf("Total cost for %sKg: %f$%n", weight, (weight * 5));
  }

  @Override
  public void maxLoadQuantity() {
    System.out.printf("Maximum weight: %dKg%n", 15000);
  }
}
