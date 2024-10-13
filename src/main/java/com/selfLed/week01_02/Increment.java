package com.selfLed.week01_02;

public class Increment {
	/* Post-Increment */
	int a = 5; 
	int b = a++; 

	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=5

	/* Pre-Increment */
	a = 5; 
	b = ++a; 

	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=6

	/* Post-Decrement */
	int a = 5; 
	int b = a--; 

	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=4, b=5

	/* Pre-Decrement */
	a = 5; 
	b = --a; 

	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=4, b=4
