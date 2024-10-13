package com.selfLed.week03_04;

public class Main {
	public static void main(String[] args) {

        // Create a variable from the MyThread class here.
    MyThread thread = new MyThread(20);
    
        // Start the thread here
        thread.start();
    }

}