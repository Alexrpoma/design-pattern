package com.patterns.creational_patterns.abstract_factory_pattern.flying_animal;

public interface FlyingAnimal {
  default String generalInfo(){
    return "It is considered a wild, non-domesticated animal.";
  }
  String makeSound();
  String flying();
  String meal();
  String color();
  String description();
}
