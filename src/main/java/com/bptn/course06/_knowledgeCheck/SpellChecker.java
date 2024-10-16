package com.bptn.course06._knowledgeCheck;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpellChecker
   {
      private ArrayList<String> dictionary;

      public SpellChecker() throws IOException {
        // Let's use java.nio method readAllLines!
        List<String> lines = Files.readAllLines(Paths.get("dictionary.txt"));
        dictionary = new ArrayList<String>(lines);
        
      }
  
      /** This uses linear search to find a word 
        * in the dictionary ArrayList and also
        * prints out the number of words checked.
        * If not found, word is misspelled.
      */
      public boolean linearSpellCheck(String word)
      {
          int count = 0;
          for(int i=0; i < dictionary.size(); i++) 
          {
            count++;
            if (word.equals(dictionary.get(i))) {
                System.out.println("Number of words checked: " + count);
                return true;
            }
          }
         System.out.println("Number of words checked: " + count);
         return false;

      }

   /** This uses binary search to find a word 
        * in the dictionary ArrayList.
        * If not found, word is misspelled.
        * ADD IN CODE TO COUNT and PRINT OUT THE NUMBER OF WORDS CHECKED!
      */
  public boolean binarySpellCheck(String word) {
        int count = 0;
        int left = 0;
        int right = dictionary.size() - 1;
        while (left <= right)
        {
          count++;
           int middle = (left + right) / 2;
           if (word.compareTo(dictionary.get(middle)) < 0)
           {
              right = middle - 1;
           }
           else if (word.compareTo(dictionary.get(middle)) > 0)
           {
              left = middle + 1;
           }
           else {
              System.out.println("Binary " + count);
              return true;
           }
          
         }
    System.out.println("Binary " + count);
         return false;
     }

   
    
   }


class Main 
{
  public static void main(String[] args) throws IOException 
  {
    SpellChecker checker = new SpellChecker();

    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q")) {
      if (checker.linearSpellCheck(word))
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");
      checker.binarySpellCheck(word);
      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
      scan.close();
  }
}