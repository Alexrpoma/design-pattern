package com.patterns.structural_patterns.adapter_pattern;

public class App {

  public static void main(String[] args) {

    RoundPeg roundPeg0 = new RoundPeg(12);
    RoundPeg roundPeg1 = new RoundPeg(44);

    SquarePeg squarePeg0 = new SquarePeg(23);
    SquarePeg squarePeg1 = new SquarePeg(40);

    SquarePegAdapter squarePegAdapter0 = new SquarePegAdapter(squarePeg0);
    SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);

    RoundHole roundHole = new RoundHole(40);

    if(roundHole.fits(roundPeg0)) {
      System.out.printf("The roundPeg0 with area %s fits round hole!%n", roundPeg0.getArea());
    } else {
      System.out.println("The roundPeg0 doesn't fit into round hole!");
    }
    if(roundHole.fits(roundPeg1)) {
      System.out.printf("The roundPeg1 with area %s fits round hole!%n", roundPeg1.getArea());
    } else {
      System.out.println("The roundPeg1 doesn't fit into round hole!");
    }
    if(roundHole.fits(squarePegAdapter0)) {
      System.out.printf("The squarePegAdapter0 with area %s fits round hole!%n", squarePegAdapter0.getArea());
    } else {
      System.out.println("The squarePegAdapter0 doesn't fit into round hole!");
    }
    if(roundHole.fits(squarePegAdapter1)) {
      System.out.printf("The squarePegAdapter1 with area %s fits round hole!%n", squarePegAdapter1.getArea());
    } else {
      System.out.println("The squarePegAdapter1 doesn't fit into round hole!");
    }
  }
}
