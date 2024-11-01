package com.bptn.course06._knowledgeCheck;

public class NeverEnds {

	public static void main(String[] args) {
		neverEnd(0);

	}

	private static void neverEnd(int num) {
		System.out.println("This is the method that never ends" + num);
		neverEnd(num);
		
		
	}

}
