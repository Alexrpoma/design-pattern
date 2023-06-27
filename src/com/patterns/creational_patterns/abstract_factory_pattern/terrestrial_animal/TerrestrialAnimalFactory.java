package com.patterns.creational_patterns.abstract_factory_pattern.terrestrial_animal;

import com.patterns.creational_patterns.abstract_factory_pattern.AbstractAnimalFactory;

public class TerrestrialAnimalFactory implements AbstractAnimalFactory<TerrestrialAnimal> {


  @Override
  public TerrestrialAnimal create(String animal) {
    if (animal.equals("Dog")) {
      return new Dog();
    }
    else if (animal.equals("Cat")) {
      return new Cat();
    }
    else throw new IllegalArgumentException("Anima type doesn't exist!");
  }
}
