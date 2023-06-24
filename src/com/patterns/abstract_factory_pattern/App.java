package com.patterns.abstract_factory_pattern;

import com.patterns.abstract_factory_pattern.flying_animal.FlyingAnimalFactory;
import com.patterns.abstract_factory_pattern.terrestrial_animal.TerrestrialAnimalFactory;

public class App {
  public static void main(String[] args) {
    var terrestrialAnimalFactory = (TerrestrialAnimalFactory) AnimalFactoryProvider.getAnimalFactory("TerrestrialAnimal");
    var dog = terrestrialAnimalFactory.create("Dog");
    System.out.println(dog.generalInfo());
    System.out.println(dog.description());

    System.out.println();
    var flyingAnimalFactory = (FlyingAnimalFactory) AnimalFactoryProvider.getAnimalFactory("FlyingAnimal");
    var eagle = flyingAnimalFactory.create("Eagle");
    System.out.println(eagle.description());
    System.out.println(eagle.generalInfo());
  }
}
