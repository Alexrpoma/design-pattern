package com.patterns.creational_patterns.singleton_pattern;

import java.util.Enumeration;

public class App {
  public static void main(String[] args) {
    DataBaseConnection dataBaseConnection = DataBaseConnection.getInstance();
    String info = dataBaseConnection.showInfo();
    System.out.println(info);
    System.out.printf("dataBaseConnection hashcode: %s%n", dataBaseConnection.hashCode());

    DataBaseConnection dataBaseConnection1 = DataBaseConnection.getInstance();
    System.out.printf("dataBaseConnection1 hashcode: %s%n", dataBaseConnection1.hashCode());
    System.out.printf("Both of them are equals: %s", dataBaseConnection.equals(dataBaseConnection1));
    Enumeration<Integer> integerEnumeration = new Enumeration<Integer>() {
      @Override
      public boolean hasMoreElements() {
        return false;
      }

      @Override
      public Integer nextElement() {
        return null;
      }
    };
  }
}
