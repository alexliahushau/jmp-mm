package com.mentoring;

/**
 * Hello world!
 *
 */
public class HeapSpace {
    public static void main( String[] args ) {
        String name = "MyName";
        while (true) {
            name = name + name;
            Person person = new Person(Long.MAX_VALUE, name);
            System.out.println(person);
        }

    }
}

class Person {
    long age;
    String name;

    Person(long age, String name) {
        this.age = age;
        this.name = name;
    }

}
