package com.example.myapplication;

public class UnitConverter {
    public static double celsius2Farenheit(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double farenheit2Celcius(double c) {
        return 32 + c * 9 / 5;
    }

}
