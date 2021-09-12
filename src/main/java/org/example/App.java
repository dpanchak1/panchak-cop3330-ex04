/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun= input.nextLine();
        System.out.print("Enter a verb: ");
        String verb= input.nextLine();
        System.out.print("Enter an adjective: ");
        String adj= input.nextLine();
        System.out.print("Enter an adverb: ");
        String adv= input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);

    }
}
