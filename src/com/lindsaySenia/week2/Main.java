package com.lindsaySenia.week2;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        bootScript();
//        greetPlayer();
        String name = greetPlayer();
        System.out.printf("Welcome, " + name + "! Glad to have you on board.");

        confirmation();

        System.out.println("PAUSE");
    }

    private static void confirmation() {
        System.out.println("You did say you'd join us, right?");
        System.out.printf("(Y/N):  ");
        String confirmation = input.nextLine();
        if (confirmation.equals("Y")) {
            System.out.println("Oh great! I couldn't stand to lose another recruit after what happened...");
        } else {
            System.out.println("Suit yourself. You could've been a legend.");
            System. exit(0);
        }
    }
// do while loop
    //loop once



    private static void bootScript() {
        System.out.println("Loading...");
        System.out.println("       ...");
        System.out.println("        ..");
        System.out.println("         .");
        System.out.println("          ");
        System.out.println("          ");

        System.out.println("Welcome to NASA headquarters.");
        System.out.println("Your mission, should you choose to accept it, is to be the first human to walk on Mars.");
        System.out.println(" ");

    }

    private static String greetPlayer() {
        System.out.println("Pardon me, I didn't introduce myself. My name is Rob Otto.");
        System.out.println("That's Mr. Rob Otto to you. What is your name?");
        String name = input.nextLine();
        return name;
    }
}
