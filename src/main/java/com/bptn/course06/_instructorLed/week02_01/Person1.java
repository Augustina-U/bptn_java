package com.bptn.course06._instructorLed.week02_01;

public class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name; // Using "this" to refer to the instance variable
    }

    public void introduce() {
        System.out.println("Hi, my name is " + this.name); // Using "this" to refer to the instance variable
    }

    // Main method for Testing
    public static void main(String[] args) {
        // Create a new Person object
        Person1 person = new Person1("John Doe");

        // Call the introduce method to print the person's name
        person.introduce();
    }
}
