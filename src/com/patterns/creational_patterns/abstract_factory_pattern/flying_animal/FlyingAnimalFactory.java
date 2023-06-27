package com.patterns.creational_patterns.abstract_factory_pattern.flying_animal;

import com.patterns.creational_patterns.abstract_factory_pattern.AbstractAnimalFactory;

public class FlyingAnimalFactory implements AbstractAnimalFactory<FlyingAnimal> {
  @Override
  public FlyingAnimal create(String animal) {
    if (animal.equals("Eagle")) {
      return new Eagle();
    }
    if (animal.equals("Duck")) {
      return new Duck();
    }
    throw new IllegalArgumentException("Type of animal doesn't exist!");
  }
}
