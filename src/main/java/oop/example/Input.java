package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Input {

    public double getLength(){
        Scanner input = new Scanner(System.in);
        double length;
        do {

            System.out.println("What is the length of the room in feet? ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid length.");
            }
            length = input.nextDouble();
        } while (length < 0);
        return length;
    }

    public double getWidth(){
        Scanner input = new Scanner(System.in);
        double width;
        do {

            System.out.println("What is the width of the room in feet? ");
            while (!input.hasNextDouble()) {
                String str2 = input.next();
                System.out.println(str2 + " is not a valid width.");
            }
            width = input.nextDouble();
        } while (width < 0);
        return width;

    }
}
