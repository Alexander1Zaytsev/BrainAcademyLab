package com.brainacad.lab2_8;

public class Rectangle extends Shape implements Comparable {              //Lab 2-8 Comparable and Comparator

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
        return "This is Rectangle, color: " + shapeColor + ", width = " + width + ", height = " + height;
    }

    @Override
    public int compareTo(Object o){
        if (this.calcArea() > ((Rectangle)o).calcArea()) return 1;
        if (this.calcArea() < ((Rectangle)o).calcArea()) return -1;
        return 0;
    }

    public static Rectangle parseRectangle(String str){                                  //Lab 2-10-4
        String numbers = str.split(":")[2];
        return new Rectangle(str.split(":")[1], Double.parseDouble(numbers.split(",")[0]),
                Double.parseDouble(numbers.split(",")[1]));
    }

}
