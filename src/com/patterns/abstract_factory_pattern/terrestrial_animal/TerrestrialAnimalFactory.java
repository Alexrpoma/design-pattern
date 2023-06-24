package com.patterns.abstract_factory_pattern.terrestrial_animal;

import com.patterns.abstract_factory_pattern.AbstractAnimalFactory;

public class TerrestrialAnimalFactory implements AbstractAnimalFactory<TerrestrialAnimal> {

  private static TerrestrialAnimal terrestrialAnimal;

  @Override
  public TerrestrialAnimal create(String animal) {
    if (animal.equals("Dog")) {
      terrestrialAnimal = new Dog();
    }
    else if (animal.equals("Cat")) {
      terrestrialAnimal = new Cat();
    }
    else throw new IllegalArgumentException("Anima type doesn't exist!");
    return terrestrialAnimal;
  }
}
