package com.patterns.abstract_factory_pattern;

public interface AbstractAnimalFactory<T> {
  T create(String animal);
}
