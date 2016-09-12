package com.brainacad.lab2_2_3;

/**
 * Created by Alex on 9/11/2016.
 */
public class Employee {
    public void calcSalary(String name, double... salary){
        double res = 0;
        for (double element: salary){
            res += element;
        }
        System.out.println(name + ": " + Math.round(res*100) / 100.0);
    }
}
