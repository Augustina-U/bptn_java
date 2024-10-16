package com.bptn.course06._selfLed.week01_02;

public class ErrorSwap {
	public static void main(String[] args) {
	     int h = 3;
	     int w = 5;
	     System.out.println(h);  //3
	     System.out.println(w);  //5
	     h = w;
	     w = h;
	     System.out.println(h);  //expected 5
	     System.out.println(w);  //expected 3
	   }
	}