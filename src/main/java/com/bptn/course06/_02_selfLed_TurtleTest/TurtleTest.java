package com.bptn.course06._02_selfLed_TurtleTest;
import java.awt.Color;
public class TurtleTest {
	public static void main(String[] args) {
        World habitat = new World(300, 300, Color.WHITE);
        Turtle yertle = new Turtle(habitat);
        yertle.forward(50);
        yertle.forward(50);
        yertle.right(50);
        //yertle.forward(50);
        yertle.goTo(0,0);
    }
}