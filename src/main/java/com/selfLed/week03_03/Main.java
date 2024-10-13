package com.selfLed.week03_03;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
        // Instantiate HashMap and try to use some of the methods listed above.
       String car = "red";
       String box = "white";
       String house = "brown";
       
       
       HashMap<String, String> play = new HashMap<>();
       play.put ("car","red");
       play.put ("box","white");
       play.put ("house","brown");
       System.out.println (play);

    }

}