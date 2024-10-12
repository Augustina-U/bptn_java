package com.bptn.selfLed_08_vehicle;

public class Vehicle {
    // Declare String colour and String brand attributes.
    private String colour;
    private String brand;

    // Define parameterized constructor for colour and brand that sets the class attributes.
    public Vehicle(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }

    // Getters
    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }
}

