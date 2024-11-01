package com.bptn.course06._instructorLed.week02_022;

public class Bike extends Vehicle {
    
    //Step 3a: Declare String bikeHandle 
    String bikeHandle;
    //Step 3b: Define parameterized constructor for color, brand, bikeHandle
    public Bike(String color, String brand, String bikeHandle) {
        // Call the parent constructor
        super(color, brand);
        this.bikeHandle = bikeHandle;
    }

    //Step 3c: Create a print() method as per the specification in the above
  @Override
    public void print() {
        super.print();  // Call the parent class's print method
        
    }
}