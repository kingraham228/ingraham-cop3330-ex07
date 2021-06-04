package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App 
{
    public static void main( String[] args )
    {
        Input measurements = new Input ();
        Math areaMath = new Math();
        double length = measurements.getLength();
        double width = measurements.getWidth();
        double areaFeet = areaMath.getAreaFeet(length,width);
        double meterConv = areaMath.feettoMeterConversion(areaFeet);

        System.out.println("What is the length of the room in feet? " +length);
        System.out.println("What is the width of the room in feet? " + width);
        System.out.printf("You entered dimensions of %.3f feet by %.3f feet.%n", length, width);
        System.out.println("The area is ");
        System.out.printf("%.3f square feet%n", areaFeet);
        System.out.printf("%.3f square meters", meterConv);

    }
}
