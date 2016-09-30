package com.brainacad.lab2_8;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alex on 9/20/2016.
 */
public abstract class Shape implements Drawable {        // Lab 2-8 add implements

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
    public void draw() {                               // Lab 2-8 override method draw
        System.out.println(this);
        System.out.println("Area is " + this.calcArea());
    }

   public static Shape parseShape(String str) throws InvalidShapeStringException{              //Lab 2-10-3
       String emplat = "(^\\w+):(\\w+):(\\d+)((.\\d+)*)((\\d+)((.\\d+)*))*";            //Lab 2-11-4
       Pattern pat = Pattern.compile(emplat);
       Matcher m = pat.matcher(str);
       if (!m.matches()) throw new InvalidShapeStringException();

       Shape shape = null;
       String numbers = str.split(":")[2];
       if (str.split(":")[0].compareToIgnoreCase("Rectangle") == 0){
           shape = new Rectangle(str.split(":")[1], Double.parseDouble(numbers.split(",")[0]),
                   Double.parseDouble(numbers.split(",")[1]));
       }
       if (str.split(":")[0].compareToIgnoreCase("Circle") == 0){
           shape = new Circle(str.split(":")[1], Double.parseDouble(numbers));
       }
       if (str.split(":")[0].compareToIgnoreCase("Triangle") == 0){
           shape = new Triangle(str.split(":")[1], Double.parseDouble(numbers.split(",")[0]),
                   Double.parseDouble(numbers.split(",")[1]),Double.parseDouble(numbers.split(",")[1]));
       }
       return shape;
    }

    public static Shape parseShape1(String str){              //Lab 2-10-4
        Shape shape = null;
        if (str.split(":")[0].compareToIgnoreCase("Rectangle") == 0){
            shape = Rectangle.parseRectangle(str);
        }
        if (str.split(":")[0].compareToIgnoreCase("Circle") == 0){
            shape = Circle.parseCircle(str);
        }
        if (str.split(":")[0].compareToIgnoreCase("Triangle") == 0){
            shape = Triangle.parseTriangle(str);
        }
        return shape;
    }
}


