package com.patterns.creational_patterns.singleton_pattern.threat_singleton;

public class Message {

  private static Message instance;

  private final String text;

  private Message(String text){
    // The following code emulates slow initialization.
    try {
      Thread.sleep(500);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    this.text = text;
  }

  //When we work with threads, it's necessary use synchronized method for avoid issues
  //when we create singleton classes, although it is more expensive to execute the code.
  public static synchronized Message getInstance(String message) {
    if (instance == null) {
      instance = new Message(message);
    }
    return instance;
  }

  public String getText() {
    return text;
  }
}
