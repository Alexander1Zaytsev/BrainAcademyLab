package com.brainacad.lab2_6_5.shapes;

import static java.lang.Math.sqrt;

/**
 * Created by Alex on 9/26/2016.
 */
public class Triangle {

    private double a = 1.0, b = 1.0, c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
