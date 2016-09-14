package com.brainacad.lab2_4_5;

/**
 * Created by Alex on 9/14/2016.
 */
public class MyCalc {

    public static double calcPi(int n){

        double pi = 4;
        if (n > 1) {

            final int STATE = 4;
            double k = 3.0;
            byte changeOperand = -1;

            while (n > 1){
                pi = pi + (changeOperand) * STATE / k;
                changeOperand *= -1;
                k += 2;
                n--;
            }

        } else {
            System.out.println("n must be larger then one");
            pi = -1;
        }

        return  pi;
    }
}
