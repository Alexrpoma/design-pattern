package com.patterns.abstract_factory_pattern.terrestrial_animal;

public class Dog implements TerrestrialAnimal{
  @Override
  public String generalInfo() {
    return "Domestic animal, normally used as a pet, for protection and work.";
  }

  @Override
  public String makeSound() {
    return "Woff woff!!";
  }

  @Override
  public String run() {
    return "Run by its four legs.";
  }

  @Override
  public String meal() {
    return "Eat foods such as: meat, vegetables and others.";
  }

  @Override
  public String color() {
    return "Exist several types of colors.";
  }

  @Override
  public String description() {
    return "Canis familiaris or Canis lupus familiaris is a terrestrial animal";
  }
}
