/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print("What is your age? ");
        String Age = scan.nextLine();

        // Turn string to int
        int iAge = Integer.parseInt(Age);

        // Ternary Operator
        String out = (iAge >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(out);
    }
}