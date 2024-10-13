package com.selfLed.week01_03;

import java.util.Scanner;

public class HeadsOrTails {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input is Heads Value (true/false): ");
        boolean isHeads = scan.nextBoolean();
        if (isHeads) {
            System.out.println("Let's go to the game");
        } else {
            System.out.println("Let's watch a movie");
        }
        System.out.println("after conditional");
    }
}