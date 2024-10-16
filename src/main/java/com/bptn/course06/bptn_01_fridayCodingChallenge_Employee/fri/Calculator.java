package com.bptn.course06.bptn_01_fridayCodingChallenge_Employee.fri;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        
	    Scanner displ = new Scanner(System.in);
	    
	    int continueCalc = 1; 
	    while (continueCalc == 1) {
	    // Display menu

	    System.out.println("/...Calculator Menu.../");
	    System.out.println("Press 1 for addition");
	    System.out.println("Press 2 for subtraction");
	    System.out.println("Press 3 for multiplication");
	    System.out.println("Press 4 for division");
	    System.out.println("Press 5 to square a number");
	    System.out.println("Press 6 to find a square root");
	    System.out.println("Press 7 to find the reciprocal");
	    
	    int press = displ.nextInt(); //reading input
	    
	      //declare variables
	    double num1, num2;

	//operation expressions
	  if (press == 1) {//addition
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    System.out.println("Enter the second number:");
	    num2 = displ.nextDouble();
	    Double add = num1 + num2;
	    System.out.println("result: " + add);
	    
	  }else if (press == 2) {//subtraction
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    System.out.println("Enter the second number:");
	    num2 = displ.nextDouble();
	    Double subt = num1 - num2;
	    System.out.println("result: " + subt);  
	    
	  }else if (press == 3) {//multiplication
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    System.out.println("Enter the second number:");
	    num2 = displ.nextDouble();
	    Double mult = num1 * num2;
	    System.out.println("result: " + mult);  
	    
	  }else if (press == 4) {//division
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    System.out.println("Enter the second number:");
	    num2 = displ.nextDouble();
	    double div = num1 / num2;
	    System.out.println("result: " + div); 

	  
	  }else if (press == 5) {//square a number
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    Double sqr = num1 * num1;
	    System.out.println("result: " + sqr);

	  }else if (press == 6) {//find a square root
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    double sqrt = Math.sqrt(num1);
	    System.out.println("result: " + sqrt);

	  }else if (press == 7) {//find the reciprocal
	    System.out.println("Enter the first number:");
	    num1 = displ.nextDouble();
	    double rpl = 1 / num1;
	    System.out.println("result: " + rpl);

	  }else {
	            System.out.println("Invalid choice! Please make a valid choice.");
	         // Ask if the user wants to continue
	  }
	        System.out.println("To continue calculation, press 1; else, press any other number to exit.");
	         continueCalc = displ.nextInt();
	        }
	        
	        displ.close(); // Close the scanner
	    }
	}


