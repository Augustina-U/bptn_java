package com.bptn.course06._instructorLed.week02_011;

public class Car {
    private String color; // Class variable for color
    private String brand; // Class variable for brand
    private int price;    // Class variable for price

    // Parameterized constructor
    public Car(String color, String brand, int price) {
        this.color = color;  // Assign parameter to class variable
        this.brand = brand;  // Assign parameter to class variable
        this.price = price;  // Assign parameter to class variable
    }

    // Default constructor
    public Car() {
        this("Red", "GenericBrand", 20000); // Call parameterized constructor with default values
    }

    // Getters and setters (optional)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method to display car details
    public void printCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: $" + price);
    }
}
