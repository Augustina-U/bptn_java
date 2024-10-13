package com.selfLed.week02_03;

public class APStudent extends Student{
	private int apScore;
    
	// parameterized Constructor for APStudent using super to call the parent constructor
	 public APStudent( String name, int id, int apScore) {
	    
	    //using super keyword to call the parent constructor    
	        super(name, id);
	        this.apScore = apScore; 
	      }
	   // Overriding the toString() method to append AP score to the output  
	     @Override
	     public String toString() {
	        return super.toString() + " " + apScore;
	    }
	}
