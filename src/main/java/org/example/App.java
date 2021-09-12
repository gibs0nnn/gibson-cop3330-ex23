package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String input = "empty";

        System.out.println("Answer all questions with y for yes and n for no");
        System.out.print("\nIs the car silent when you turn the key? ");
        input = scanner.next();
        if(input.contentEquals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            input = scanner.next();
            if(input.contentEquals("y")) {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            } else if(input.contentEquals("n")){
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        } else if(input.contentEquals("n")) {
            System.out.print("Does the car make a clicking noise? ");
            input = scanner.next();
            if(input.contentEquals("y")) {
                System.out.println("Replace the battery.");
                System.exit(0);
            } else if(input.contentEquals("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                input = scanner.next();
                if(input.contentEquals("y")) {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                } else if(input.contentEquals("n")) {
                    System.out.print("Does the engine start and then die? ");
                    input = scanner.next();
                    if(input.contentEquals("y")) {
                        System.out.print("Does the car have fuel injection? ");
                        input = scanner.next();
                        if(input.contentEquals("y")) {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        } else if(input.contentEquals("n")) {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    } else if(input.contentEquals("n")) {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Incorrect input given in the program");
    }
}
