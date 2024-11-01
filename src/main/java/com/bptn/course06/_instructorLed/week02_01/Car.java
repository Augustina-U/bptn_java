package com.bptn.course06._instructorLed.week02_01;

class Car {
    // Step 2: Define instance variables
    private String color;
    private String brand;
    private int price;

    // Step 4: Constructor to initialize the variables
    public Car(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    void printCarDetails() {
        System.out.println("Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}');
    }

    // Step 5: Private method to print car details
    private void print() {
        System.out.println("Car Details: " +
                "Color: " + color + ", " +
                "Brand: " + brand + ", " +
                "Price: $" + price);
    }
}
