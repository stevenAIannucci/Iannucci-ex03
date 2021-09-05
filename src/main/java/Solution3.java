/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Steven Iannucci
 */

import java.util.Scanner;

public class Solution3 {

    public static void main(String[ ] args) {
        //print "What is the quote? "
        //ask user for input to variable quote
        //print "Who said it? "
        //ask user for input to variable who
        //print (who + "says" + quote)
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = (input.nextLine());
        System.out.println("Who said it? ");
        String who = (input.nextLine());
        System.out.println(who + " says, " + "\"" + quote + "\"");
    }

}
