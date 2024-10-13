package com.bptn_01_fridayCodingChallenge_Employee.fri;

import java.util.Scanner;

public class PluralForm {
	public static void main(String[] args) {

        // initialize a Scanner to read input from the user
        Scanner display = new Scanner(System.in);

        // ask user for the number of items and read the input
        System.out.print("Enter a non-negative integer: ");
        int amt = display.nextInt();

        display.nextLine();

        // ask user for a singular noun (word) and read the input
        System.out.print("Enter a singular noun: ");
        String word = display.nextLine();

        // method to pluralize the noun 
        String result = pluralize(amt, word);

        // Print the result
        System.out.println(result);
    }

    
    public static String pluralize(int amt, String word) {
        // Check if the amount is 1, if yes return singular version
        if (amt == 1) {
            return amt + " " + word; 
        }

        // Check for special cases for words ending in "y"
        if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
            return amt + " " + word + "s"; // Simply add 's' for these cases
        }

        // Check if the word ends with "y" and not preceded by a vowel
        if (word.endsWith("y")) {
            // Remove 'y' and add 'ies' for plural
            return amt + " " + word.substring(0, word.length() - 1) + "ies";
        }

        // Check if the word ends with "us" and not preceded by a vowel
        if (word.endsWith("us")) {
            // Remove 'us' and add 'i' for plural
            return amt + " " + word.substring(0, word.length() - 2) + "i";
        
        }

        // Check if the word ends with "us" and not preceded by a vowel
        if (word.endsWith("fe")) {
            // Remove 'fe' and add 'ves' for plural
            return amt + " " + word.substring(0, word.length() - 2) + "ves";
        
        }
        // Check for special cases for words ending in "y"
        if (word.endsWith("sh") || word.endsWith("ch")) {
            return amt + " " + word + "es"; // Simply add 'es' for these cases
                 
        }
        // For most nouns, just add 's' to form the plural
        return amt + " " + word + "s";
    
    }
}

/*
Summary:
This task involved writing a program to pluralize nouns based on specific rules. 
A key challenge was ensuring special cases were checked before general rules. 
In future tasks, I'll be mindful of word endings to avoid pluralization errors.
*/


