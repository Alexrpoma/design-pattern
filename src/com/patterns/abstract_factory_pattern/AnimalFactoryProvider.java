package com.patterns.abstract_factory_pattern;

import com.patterns.abstract_factory_pattern.flying_animal.FlyingAnimalFactory;
import com.patterns.abstract_factory_pattern.terrestrial_animal.TerrestrialAnimalFactory;

public class AnimalFactoryProvider {

  public static AbstractAnimalFactory getAnimalFactory(String animalType) {
    if (animalType.equals("FlyingAnimal")) {
      return new FlyingAnimalFactory();
    }
    else if (animalType.equals("TerrestrialAnimal")) {
      return new TerrestrialAnimalFactory();
    }
    else throw new IllegalArgumentException(animalType + " factory doesn't exist!");
  }
}
