package com.brainacad.lab2_8;

public class Triangle extends Shape {

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

    public static Triangle parseTriangle(String str){                                  //Lab 2-10-4
        String numbers = str.split(":")[2];
        return new Triangle(str.split(":")[1], Double.parseDouble(numbers.split(",")[0]),
                Double.parseDouble(numbers.split(",")[1]),Double.parseDouble(numbers.split(",")[1]));
    }


}
