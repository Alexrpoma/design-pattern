package com.patterns.prototype_pattern;

public class Square extends Shape{

  private int side;

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
}
