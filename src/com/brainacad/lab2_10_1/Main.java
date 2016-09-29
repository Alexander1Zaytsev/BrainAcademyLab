package com.brainacad.lab2_10_1;

/**
 * Created by User on 29/09/2016.
 */
public class Main {

    static Integer x1 = 15;
    static Integer x2 = new Integer(15);
    static Integer x3 = Integer.valueOf(15);
    static Integer x4 = Integer.parseInt("15");

    static Integer x5 = 250;
    static Integer x6 = new Integer(250);
    static Integer x7 = Integer.valueOf(250);
    static Integer x8 = Integer.parseInt("250");

    public static void main(String[] args) {

        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);
        System.out.println(x2 == x3);
        System.out.println(x2 == x4);
        System.out.println(x3 == x4);

        System.out.println("\n");

        System.out.println(x5 == x6);
        System.out.println(x5 == x7);
        System.out.println(x5 == x8);
        System.out.println(x6 == x7);
        System.out.println(x6 == x8);
        System.out.println(x7 == x8);

    }
}
