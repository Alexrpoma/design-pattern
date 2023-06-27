package com.patterns.creational_patterns.build_pattern;

import java.util.UUID;

public class Person {

  private final UUID uuid;
  private final String firstName;
  private final String lastName;
  private final String username;
  private final String email;
  private final int age;
  private final String profession;

  public Person(Builder builder) {
    this.uuid = builder.uuid;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.username = builder.username;
    this.email = builder.email;
    this.age = builder.age;
    this.profession = builder.profession;
  }

  @Override
  public String toString() {
    return "Person{" +
        "\nuuid=" + uuid +
        ", \nfirstName='" + firstName + '\'' +
        ", \nlastName='" + lastName + '\'' +
        ", \nusername='" + username + '\'' +
        ", \nemail='" + email + '\'' +
        ", \nage=" + age +
        ", \nprofession='" + profession + '\'' +
        '}';
  }

  public static class Builder {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private int age;
    private String profession;

    public Builder uuid(UUID uuid) {
      this.uuid = uuid;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder username(String username) {
      this.username = username;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder profession(String profession) {
      this.profession = profession;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
