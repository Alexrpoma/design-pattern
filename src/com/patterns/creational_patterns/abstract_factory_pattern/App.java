package com.patterns.creational_patterns.abstract_factory_pattern;

public class App {
  public static void main(String[] args) {
    var terrestrialAnimalFactory = AnimalFactoryProvider.getTerrestrialAnimalFactory();
    var dog = terrestrialAnimalFactory.create("Dog");
    System.out.printf(
        """
            Dog:
            %s
            %s
            %s
            %s
            %s
            %s
            %n""", dog.generalInfo(),
        dog.description(),
        dog.makeSound(),
        dog.meal(),
        dog.color(),
        dog.run()
    );

    var flyingAnimalFactory = AnimalFactoryProvider.getFlyingAnimalFactory();
    var eagle = flyingAnimalFactory.create("Eagle");
    System.out.printf(
        """
            Eagle:
            %s
            %s
            %s
            %s
            %s
            %s
            %n""", eagle.generalInfo(),
        eagle.description(),
        eagle.makeSound(),
        eagle.meal(),
        eagle.color(),
        eagle.flying()
    );
  }
}
