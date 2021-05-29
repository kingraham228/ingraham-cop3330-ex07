package oop.example;

public class Math {
    private final double conversionConstant = .09290304;

    public double getAreaFeet(double a, double b){
        return a * b;
    }

    public double feettoMeterConversion(double feet){
        return feet * conversionConstant;
    }
}
