package com.brainacad.lab2_8;

import java.util.Comparator;

/**
 * Created by Alex on 9/20/2016.
 */
public abstract class Shape implements Drawable {

    protected String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString(){
        return "Shape, color is: " + shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(this);
        System.out.println("Area is " + this.calcArea());
    }
}


class Circle extends Shape{

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

}


class Rectangle extends Shape implements Comparable, Comparator{

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "This is rectangle, color: " + shapeColor + ", width = " + width + ", height = " + height;
    }

    @Override
    public int compareTo(Object o){
        if (this.calcArea() > ((Rectangle)o).calcArea()) return 1;
        if (this.calcArea() < ((Rectangle)o).calcArea()) return -1;
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2){
        if (((Rectangle)o1).calcArea() > ((Rectangle)o2).calcArea()) return 1;
        if (((Rectangle)o1).calcArea() < ((Rectangle)o2).calcArea()) return -1;
        return 0;
    }


}


class Triangle extends Shape {

    private double a, b, c;

        public Triangle(String shapeColor, double a, double b, double c) {
            super(shapeColor);
            this.a = a;
            this.b = b;
            this.c = c;
        }

    @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString(){
        return "This is Triangle, color: " + shapeColor + ", a = " + a + ", b = " + b + ", c = " + c;
    }


}