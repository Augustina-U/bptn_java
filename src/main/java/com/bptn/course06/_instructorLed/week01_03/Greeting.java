package com.bptn.course06._instructorLed.week01_03;

public class Greeting {
    public static void main(String[] args) {
        String start = "Happy Birthday";
        
        String fullName = "John Doe";
        String result = start + " " + fullName;  // add together strings
        result += "!!!"; // add on to the same string
        System.out.println(result);
    }
}
