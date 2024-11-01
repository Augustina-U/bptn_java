package com.bptn.course06._instructorLed.week02_01;

public class Person {
    private String name;
    private String email;

    public Person(String initName, String initEmail) {
        name = initName;
        email = initEmail;
    }

    public String toString() {
        // We can't access i or id here because they were defined inside the loop
        // System.out.println("i at the current iteration is " + i);
        // System.out.println("The current id is " + id);

        return name + ": " + email;
    }

    // main method for testing
    public static void main(String[] args) {
        // call the constructor to create a new person
        Person p1 = new Person("Sana", "sana@gmail.com");
        System.out.println(p1);
    }
}
