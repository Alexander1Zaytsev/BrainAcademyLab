package com.brainacad.lab2_2_5;

/**
 * Created by Alex on 9/12/2016.
 */
public class Class225 {
    public static void main(String[] args) {
        int a = 10, b = 20, r = 25;

        A square = new A();

        System.out.println(square.calcSquare(a, b));
        System.out.println(square.calcSquare(r));
    }
}
