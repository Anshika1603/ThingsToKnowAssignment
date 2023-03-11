package com.knoldus.Question2;

import java.util.Scanner;

class Circle{
    public static final double PI=3.14159;

    public static double getCirumference(int radius){
        return 2*PI*radius;
    }

}


public class CircleProgram {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        int radius=Input.nextInt();
        double Circumference=Circle.getCirumference(radius);
        System.out.println("Circumference is : "+Circumference);
    }
}
