package com.patterns.creational_patterns.singleton_pattern.threat_singleton;

public class App {
  public static void main(String[] args) {
    Thread threadHello = new Thread(new ThreadHello());
    Thread threadWorld = new Thread(new ThreadWorld());
    threadHello.start();
    threadWorld.start();
  }

  static class ThreadHello implements Runnable {
    @Override
    public void run() {
      Message message = Message.getInstance("Hello");
      System.out.println(message.getText());
    }
  }

  static class ThreadWorld implements Runnable {
    @Override
    public void run() {
      Message message = Message.getInstance("World");
      System.out.println(message.getText());
    }
  }

}
