package com.patterns.creational_patterns.abstract_factory_pattern;

public interface AbstractAnimalFactory<T> {
  T create(String animal);
}
