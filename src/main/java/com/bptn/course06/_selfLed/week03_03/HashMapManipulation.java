package com.bptn.course06._selfLed.week03_03;

import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		 int A = 1;
     int B = 2;
     int C = 3;
       
       
     HashMap<String, Integer> map = new HashMap<>();
     map.put ("A",1);
     map.put ("B",2);
     map.put ("C",3);
     

		// Print the size of the map
		System.out.println("Map size:" + " " + ( map.size()));

		// Use a for loop to print the key-value pairs in the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

		// Use get() method to get the value of key "A"
     Integer valueA = map.get("A");
     
		 System.out.println("Value of key 'A':" + " " + valueA);

        // use put() method to add a new key-value pair to the map
		  map.put ("D",4);
          
      // Print message before displaying the map
      System.out.println("Map after adding a new key-value pair:");
        printMap(map);
             
    
		// Use the containsKey() method to check if the key "C" exists in the map
		if (map.containsKey("C")) {
            System.out.println("Key 'C' exists in the map.");
        } else {
            System.out.println("Key 'C' does not exist in the map.");
        }
    }
        // Method to print the key-value pairs in the map
        public static void printMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            // Print the key-value pairs using getKey() and getValue()
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
