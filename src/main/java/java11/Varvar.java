package java11;

import java.util.ArrayList;
import java.util.List;

public class Varvar {

  static class Person {
    String name;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    int age;
  }

  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("dd", 10));
    people.add(new Person("ww", 20));

    for (var person: people) {
      System.out.println("person = " + person.name);
    }
  }

}
