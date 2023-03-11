package com.knoldus.Question10;
import Shapes.*;
public class ShapesImpl {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        Triangle triangle = new Triangle(6.0, 8.0, 7.0, 7.0, 7.0);
        double circleArea=circle.getArea();
        double circlePerimeter=circle.getPerimeter();
        double rectangleArea=rectangle.getArea();
        double rectanglePerimeter=rectangle.getPerimeter();
        double triangleArea=triangle.getArea();
        double trianglePerimeter=triangle.getPerimeter();
        System.out.println("Area of Circle: "+circleArea);
        System.out.println("Circumference of Circle: "+circlePerimeter);
        System.out.println("Area of Rectangle: "+rectangleArea);
        System.out.println("Perimeter of Rectangle: "+rectanglePerimeter);
        System.out.println("Area of Triangle: "+triangleArea);
        System.out.println("Perimeter of Triangle: "+trianglePerimeter);

    }
}