package com.patterns.creational_patterns.singleton_pattern;

public class DataBaseConnection {
  private static DataBaseConnection instance;

  private DataBaseConnection(){}

  public static DataBaseConnection getInstance() {
    if (instance == null) {
      instance = new DataBaseConnection();
    }
    return instance;
  }

  public String showInfo() {
    return "SQL Connection.";
  }
}
