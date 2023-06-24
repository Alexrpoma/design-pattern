package com.patterns.abstract_factory_pattern.flying_animal;

public class Duck implements FlyingAnimal{
  @Override
  public String generalInfo() {
    return "Ducks have many economic uses, being farmed for their meat, eggs, and feathers (particularly their down).";
  }

  @Override
  public String makeSound() {
    return "quack quack";
  }

  @Override
  public String flying() {
    return """
        Many species of ducks are excellent flyers,
        particularly whilst migrating.
        Whilst all ducks have the ability to fly,
        certain species are unable or choose not to
        """;
  }

  @Override
  public String meal() {
    return "Feed ducks cracked corn, oats, rice, birdseed, frozen peas, chopped lettuce, or sliced grapes";
  }

  @Override
  public String color() {
    return """
        Males are the more colorful sex. They are patterned with multiple
        iridescent colors including green, blue, orange, black, reddish 
        brown, white, and buff
        """;
  }

  @Override
  public String description() {
    return """
        Duck is the common name for numerous species of waterfowl in the family Anatidae.
        Ducks are generally smaller and shorter-necked than swans and geese
        """;
  }
}
