package com.patterns.abstract_factory_pattern.terrestrial_animal;

public class Cat implements TerrestrialAnimal{
  @Override
  public String makeSound() {
    return "Meow meow.";
  }

  @Override
  public String run() {
    return "Rus by its four legs.";
  }

  @Override
  public String meal() {
    return "Eats foods such as: fish, meat and milk";
  }

  @Override
  public String color() {
    return "Exist several types of colors";
  }

  @Override
  public String description() {
    return "The cat (Felis catus) is a domestic species of small carnivorous mammal.";
  }
}
