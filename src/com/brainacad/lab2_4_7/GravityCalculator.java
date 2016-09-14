package com.brainacad.lab2_4_7;

/**
 * Created by Alex on 9/14/2016.
 */
public class GravityCalculator {

    public static double calcDist(double t){

        final double G = -9.81;
        double initialVelocity = 0;
        double initialPosition = 0;

        return  0.5 * G * t * t + initialVelocity * t + initialPosition;
    }
}
