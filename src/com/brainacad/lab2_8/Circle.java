package com.brainacad.lab2_8;

public class Circle extends Shape{

    private double radius;

    final double PI = 3.1415;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return PI * radius * radius;
    }

    @Override
    public String toString(){
        return "This is Circle, color: " + shapeColor + ", radius = " + radius;
    }

    public static Circle parseCircle(String str){                                  //Lab 2-10-4
        String numbers = str.split(":")[2];
        return new Circle(str.split(":")[1], Double.parseDouble(numbers));
    }

}
