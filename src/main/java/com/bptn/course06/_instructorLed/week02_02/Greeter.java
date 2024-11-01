package com.bptn.course06._instructorLed.week02_02;

public class Greeter {
    public String greet() {
        return "Hi";
    }
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        System.out.println(g1.greet()); // Output: Hi
        Greeter g2 = new MeanGreeter();
        System.out.println(g2.greet()); // Output: (the output from MeanGreeter's greet method)
        // Create a SpanishGreeter object and test it here
        Greeter g3 = new SpanishGreeter();
        System.out.println(g3.greet()); // Output: Hola!
    }
}