package com.patterns.abstract_factory_pattern.terrestrial_animal;

public interface TerrestrialAnimal {
  default String generalInfo(){
    return "It is considered a wild, non-domesticated animal.";
  };
  String makeSound();
  String run();
  String meal();
  String color();
  String description();
}
