package com.patterns.creational_patterns.abstract_factory_pattern.flying_animal;

public class Eagle implements FlyingAnimal{
  @Override
  public String makeSound() {
    return "Makes usually a series of high-pitched whistling or piping notes";
  }

  @Override
  public String flying() {
    return "Eagles can fly as high as 10,000 to 20,000 feet above sea level";
  }

  @Override
  public String meal() {
    return "Eagle diet is principally mammals and birds";
  }

  @Override
  public String color() {
    return "Adult Bald Eagles have white heads and tails with dark brown bodies and wings";
  }

  @Override
  public String description() {
    return """
        Eagle is the common name for many large birds of prey of the family Accipitridae.
        Eagles belong to several groups of genera, some of which are closely related""";
  }
}
