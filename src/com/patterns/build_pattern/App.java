package com.patterns.build_pattern;

import java.util.UUID;

public class App {

  public static void main(String[] args) {
    Person person = new Person.Builder()
        .uuid(UUID.randomUUID())
        .firstName("John")
        .lastName("Doe")
        .email("john@net.com")
        .age(23)
        .profession("Doctor")
        .username("john")
        .build();
    System.out.println(person);
  }
}
