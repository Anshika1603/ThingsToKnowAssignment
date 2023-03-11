package com.knoldus.Question8;

import java.util.Scanner;

public class MathUtils {
    public static final double E = 2.71828;

    public static double calculateExponential(double x) {
        return Math.pow(E, x);
    }

    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter value : ");
        double x = Input.nextDouble();
        double exponential = MathUtils.calculateExponential(x);
        System.out.println("The exponential of " + x + " is " + exponential);

    }
}

