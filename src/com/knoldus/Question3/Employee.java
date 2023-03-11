package com.knoldus.Question3;

public class Employee {

    private static int nextID=2014;
    private int id;
    public Employee(){
        id=nextID;
        nextID++;
    }

    public int getID(){
        return id;
    }

    public static void main(String[] args) {
     Employee employee1=new Employee();
     int UniqueID1=employee1.getID();

     Employee employee2=new Employee();
     int UniqueID2=employee2.getID();

     System.out.println(UniqueID1);
     System.out.println(UniqueID2);

    }
}
