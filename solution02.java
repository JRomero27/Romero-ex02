package exercise02;
/*
 *  UCF COP3330 Fall 2021 Exercise 2 Solution
 *  Copyright 2021 Joshua Romero
 */

import java.util.Scanner;

public class solution02 {
    public static void main(String[] args) {
        String string = ("What is the input string? ");

        Scanner input = new Scanner(System.in);
        String text = input.next();

        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        System.out.println( text + "has " + count + "characters.");
    }
}
