/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Steven Iannucci
 */

import java.util.Scanner;

public class Solution3 {

    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = (input.nextLine());
        System.out.println("Who said it? ");
        String who = (input.nextLine());
        System.out.println(who + " says, " + "\"" + quote + "\"");
    }

}
