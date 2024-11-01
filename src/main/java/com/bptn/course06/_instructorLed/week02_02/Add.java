package com.bptn.course06._instructorLed.week02_02;

public class Add {

    // Create your code here:
   // Method to add two integers
    public int add(int a, int b) {
        return a + b; // Adds the two integers
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c; // Adds the three integers
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b; // Adds the two double values
    }



    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
    public static void main(String args[]) {
        Add obj = new Add();
        System.out.println(obj.add(12, 21));
        System.out.println(obj.add(11, 23, 10));
        System.out.println(obj.add(100.10, 200.5));
    }
}
