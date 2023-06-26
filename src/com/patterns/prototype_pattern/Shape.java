package com.patterns.prototype_pattern;

import java.util.Objects;

public abstract class Shape {

  protected String color;

  public Shape(){}

  public Shape(Shape shape) {
    if (shape != null) {
      this.color = shape.color;
    }
  }

  public abstract double area();
  public abstract Shape clone();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shape shape = (Shape) o;
    return Objects.equals(color, shape.color) && Objects.equals(area(), shape.area());
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, area());
  }
}
