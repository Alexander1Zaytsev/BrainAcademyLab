package com.brainacad.lab2_2_5;

/**
 * Created by Alex on 9/12/2016.
 */
public class Class225_1 {
   static void powerTwo(final int a){
        int b = a * a; // if a = a * a; - it doesn't working, because we use "final" in assigning argument
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a = 10;
        powerTwo(a);
    }
}
