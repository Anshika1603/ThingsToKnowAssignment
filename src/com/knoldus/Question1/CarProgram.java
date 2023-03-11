package com.knoldus.Question1;

class Car{
    private static int numOfCars=0;

    Car(){
        numOfCars++;
    }

    public static int getNumOfCars(){
        return numOfCars;
    }
}



public class CarProgram {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        int totalNumOfCars=Car.getNumOfCars();
        System.out.println(totalNumOfCars);
    }
}
