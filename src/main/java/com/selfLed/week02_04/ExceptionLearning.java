package com.selfLed.week02_04;

public class ExceptionLearning {
	public static void main(String[] args) {

        try {
            //  Block of code to try, which may cause an exception
            int a = 11;
            int b = 0; // Setting b to 0 will cause an ArithmeticException when used in division
        System.out.println(a / b);   // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            //  Block of code to handle errors
        }
        System.out.println("The number cannot be divided by zero");
        // The program continues execution after handling the exception
    }

}
        /*This task helped me understand the proper structure for handling 
        exceptions and how try-catch enables programs to handle errors 
        gracefully without crashing. A key takeaway is how the control
        flow works within this structure.*/
