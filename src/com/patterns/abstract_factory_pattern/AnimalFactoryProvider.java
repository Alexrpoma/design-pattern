package com.patterns.abstract_factory_pattern;

import com.patterns.abstract_factory_pattern.flying_animal.FlyingAnimal;
import com.patterns.abstract_factory_pattern.flying_animal.FlyingAnimalFactory;
import com.patterns.abstract_factory_pattern.terrestrial_animal.TerrestrialAnimal;
import com.patterns.abstract_factory_pattern.terrestrial_animal.TerrestrialAnimalFactory;

public class AnimalFactoryProvider {
  public static AbstractAnimalFactory<TerrestrialAnimal> getTerrestrialAnimalFactory() {
    return new TerrestrialAnimalFactory();
  }
  public static AbstractAnimalFactory<FlyingAnimal> getFlyingAnimalFactory() {
    return new FlyingAnimalFactory();
  }
}
