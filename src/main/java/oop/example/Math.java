package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class Math {
    private final double conversionConstant = .09290304;

    public double getAreaFeet(double a, double b){
        return a * b;
    }

    public double feettoMeterConversion(double feet){
        return feet * conversionConstant;
    }
}
