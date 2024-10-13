package com.selfLed.week02_01;

public class TurtleTest2 {
	public static void main(String[] args) {
        World habitat = new World(300, 300, Color.WHITE);
        Turtle yertle = new Turtle(habitat);
        yertle.forward(100);
        yertle.left(90);
        yertle.forward(100);
        yertle.goTo(0,0);

        //create 2nd turtle (mytle)
        Turtle mytle = new Turtle(habitat);
        mytle.forward(100);
        
    }
}
