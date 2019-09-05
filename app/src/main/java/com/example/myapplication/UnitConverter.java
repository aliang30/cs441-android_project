package com.example.myapplication;

public class UnitConverter {
    public static double inches2Meters(double i) {
        return i / 39.37;
    }

    public static double meters2Inches(double m) {
        return m * 39.37;
    }

    public static double liters2Gallons(double l) {
        return l / 3.785;
    }

    public static double gallons2Liters(double g) {
        return g * 3.785;
    }

    public static double inches2feet(double i) {
        return i / 12;
    }

    public static double feet2inches(double f) {
        return f * 12;
    }

    public static double pounds2kilograms(double p) {
        return p / 2.205;
    }

    public static double kilograms2pounds(double k) {
        return k * 2.205;
    }


}
