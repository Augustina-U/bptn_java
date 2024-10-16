package com.bptn.course06.bptn_01_fridayCodingChallenge_Employee.fri;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		        int choice;
		        
		        // Using do-while loop to display the menu until the user chooses to exit
		        do {
		            // Display menu
		            System.out.println("/...String Menu.../");
		            System.out.println("Press 1 for Palindrome Check");
		            System.out.println("Press 2 to Reverse a String");
		            System.out.println("Press 3 to Concatenate Two Strings");
		            System.out.println("Press 4 for String Comparison");
		            System.out.println("Press 5 to Calculate the Length of a String");
		            System.out.println("Enter the option:");
		            
		            // Get user choice
		            choice = scanner.nextInt();
		            scanner.nextLine();  // Consume the newline character after integer input
		            
		            switch (choice) {
		                case 1:
		                    // Palindrome check
		                    System.out.println("Palindrome Check");
		                    System.out.println("Enter a string:");
		                    String str1 = scanner.nextLine();
		                    if (isPalindrome(str1)) {
		                        System.out.println(str1 + " is a palindrome.");
		                    } else {
		                        System.out.println(str1 + " is not a palindrome.");
		                    }
		                    break;
		                    
		                case 2:
		                    // Reverse a string
		                    System.out.println("Reverse a String");
		                    System.out.println("Enter a string:");
		                    String str2 = scanner.nextLine();
		                    System.out.println("Reversed string: " + reverseString(str2));
		                    break;
		                    
		                case 3:
		                    // Concatenate two strings
		                    System.out.println("Enter First string:");
		                    String str3a = scanner.nextLine();
		                    System.out.println("Enter Second string:");
		                    String str3b = scanner.nextLine();
		                    System.out.println("Concatenated string: " + str3a + str3b);
		                    break;
		                    
		                case 4:
		                    // String comparison
		                    System.out.println("String Comparison");
		                    System.out.println("Enter First string:");
		                    String str4a = scanner.nextLine();
		                    System.out.println("Enter Second string:");
		                    String str4b = scanner.nextLine();
		                    if (str4a.equals(str4b)) {
		                        System.out.println("The entered strings are equal.");
		                    } else {
		                        System.out.println("The entered strings are not equal.");
		                    }
		                    break;
		                    
		                case 5:
		                    // Calculate string length
		                    System.out.println("Length of a String");
		                    System.out.println("Enter a string:");
		                    String str5 = scanner.nextLine();
		                    System.out.println("The length of the entered string is: " + str5.length());
		                    break;
		                    
		                default:
		                    // Invalid choice
		                    System.out.println("Invalid choice! Please make a valid choice.");
		            }
		        } while (choice >= 1 && choice <= 5);  // Loop terminates if an invalid choice is entered

		        scanner.close();
		    }
		    // Method to check if a string is a palindrome
		    public static boolean isPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    }
		    // Method to reverse a string
		    public static String reverseString(String str) {
		        StringBuilder reversed = new StringBuilder(str);
		        return reversed.reverse().toString();
		    }
		}
