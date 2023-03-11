package com.knoldus.Question6;

import java.util.Scanner;

public class TemperatureConverter {
    public static final double CONVERSION_FACTOR = 1.8;

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * CONVERSION_FACTOR + 32;
    }

    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        double celsius = Input.nextDouble();
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degree Celsius is " + fahrenheit + " degree Fahrenheit");
    }

}

