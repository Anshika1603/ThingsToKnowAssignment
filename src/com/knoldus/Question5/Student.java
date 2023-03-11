package com.knoldus.Question5;

public class Student {
    private String name;
    private static int numOfStudents = 0;

    public Student(String name) {
        this.name = name;
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }
    public static void main(String[]args)
    {
        Student student1 = new Student("Anshika");
        Student student2 = new Student("Riya");
        Student student3 = new Student("Jasleen");
        Student student4 = new Student("Sahil");
        Student student5 = new Student("Jitin");
        Student student6 = new Student("Salil");
        Student student7 = new Student("Rahul");
        Student student8 = new Student("Nadra");
        Student student9 = new Student("Rishika");
        System.out.println("Total number of students enrolled in Java: " + Student.getNumOfStudents());
    }
}
