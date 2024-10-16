package com.bptn.course06._knowledgeCheck;

public class SortError {
	public static void main(String[] args) {}
	public static void insertionSort(int[] elements) {
		  for (int j = 1; j < elements.length ; j++) {                      // line 1
		     int temp = elements[j];                                           // line 2
		     int possibleIndex = j;                                            // line 3
		     while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) { // line 4
		        elements[possibleIndex] = elements[possibleIndex - 1];         // line 5
		        possibleIndex--;
		     }
		     elements[possibleIndex] = temp;
		  }
		}
	
	
}
