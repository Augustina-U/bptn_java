package com.bptn.course06._instructorLed.week02_022;

public class Vehicle {
	  
    private String color;
    private String brand;
    // Parameterized constructor
    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    // Method to print vehicle details
    public void print() {
        System.out.println(this.color + " " + this.brand);
    }
}