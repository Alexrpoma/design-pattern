package com.patterns.creational_patterns.factory_pattern;

public interface Transport {
  void deliver(int quantity, String packageType);
  void cost(float weight);
  void maxLoadQuantity();
  default void message(){
    System.out.println("Delivering your dreams every where!");
  }
}
