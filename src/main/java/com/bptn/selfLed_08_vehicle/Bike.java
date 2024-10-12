package com.bptn.selfLed_08_vehicle;

public class Bike extends Vehicle {
    // Additional attribute
    private String bikeHandle;

    // Parameterized constructor
    public Bike(String colour, String brand, String bikeHandle) {
        super(colour, brand); // Call the parent class constructor
        this.bikeHandle = bikeHandle;
    }

    // Getter
    public String getBikeHandle() {
        return bikeHandle;
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Bike [Colour=" + getColour() + ", Brand=" + getBrand() + ", Bike Handle=" + bikeHandle + "]";
    }
}