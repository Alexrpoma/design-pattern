package com.patterns.prototype_pattern;

public class App {

  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.color = "blue";
    circle.setRadius(12);
    System.out.println(circle);

    Circle circle1 = (Circle) circle.clone();
    circle1.setRadius(20);
    System.out.println(circle1);
    System.out.println(circle.equals(circle1));
  }
}