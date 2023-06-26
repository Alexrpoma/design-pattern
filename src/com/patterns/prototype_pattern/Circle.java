package com.patterns.prototype_pattern;

public class Circle extends Shape{

  private int radius;

  public Circle(){}

  private Circle(Circle circle) {
    super(circle);
    if (circle != null) {
      this.radius = circle.radius;
      this.color = circle.color;
    }
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        ", color='" + color + '\'' +
        ", area=" + area() +
        '}';
  }
}
