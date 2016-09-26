package com.brainacad.lab2_6_5.calc;

import com.brainacad.lab2_6_5.shapes.Triangle;

/**
 * Created by Alex on 9/26/2016.
 */
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5,5,5);
        System.out.println("Area of triangle is " + triangle.getArea());
    }
}
