package com.bptn.course06._selfLed.week02_05;

public class Car extends Vehicle{
	 // Additional attribute
    private String steeringWheel;

    // Parameterized constructor
    public Car(String colour, String brand, String steeringWheel) {
        super(colour, brand); // Call the parent class constructor
        this.steeringWheel = steeringWheel;
    }

    // Getter
    public String getSteeringWheel() {
        return steeringWheel;
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Car [Colour=" + getColour() + ", Brand=" + getBrand() + ", Steering Wheel=" + steeringWheel + "]";
    }
}
