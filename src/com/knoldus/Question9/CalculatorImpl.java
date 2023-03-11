package com.knoldus.Question9;
import math.Calculator;

import java.util.Scanner;

public class CalculatorImpl{

        public static void main(String[] args) {
            Scanner Input=new Scanner(System.in);
            System.out.println("Enter First Number : ");
            int firstNumber=Input.nextInt();
            System.out.println("Enter Second Number : ");
            int secondNumber=Input.nextInt();
            int sum = Calculator.add(firstNumber, secondNumber);
            int difference = Calculator.subtract(firstNumber, secondNumber);
            int product = Calculator.multiply(firstNumber, secondNumber);
            double quotient = Calculator.divide(firstNumber, secondNumber);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        }
}



