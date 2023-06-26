package com.patterns.prototype_pattern;

public class Square extends Shape{

  private int side;

  public Square(){}

  public Square(Square square) {
    super(square);
    if (square != null) {
      this.side = square.side;
    }
  }

  public void setSide(int side) {
    this.side = side;
  }

  @Override
  public double area() {
    return Math.pow(side, 2);
  }

  @Override
  public Shape clone() {
    return new Square(this);
  }

  @Override
  public String toString() {
    return "Square{" +
        "side=" + side +
        ", color='" + color + '\'' +
        "area=" + area() +
        '}';
  }
}
