package com.bptn.course06._knowledgeCheck;

public class Var {
	public static void main(String[] args) {
	int var1 = 0;
	int var2 = 2;

	while ((var2 != 0) && ((var1 / var2) >= 0)) {
	   var1 = var1 + 1;
	   var2 = var2 -1;
	   	}
	System.out.print(var1 +" " + var2);
}
}
