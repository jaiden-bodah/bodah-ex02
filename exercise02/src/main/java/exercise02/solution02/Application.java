/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise02.solution02;

/*Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains. */

import java.util.Scanner;

public class Application {

    /*
    prompts an input
reads in the input from the user
uses a for loop to create a way for the system to count the characters
output the number of characters
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String s = input.nextLine();

        String total = "";

        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
        }

        System.out.println("Total amount of characters: " + s.length() + " - " + s);
    }
}
