package com.brainacad.lab2_16_5;

/**
 * Created by Alexander on 10/14/2016.
 */
public class Main {

    static void foo(int i) {
        System.out.println("int = " + i);
    }

    static void foo(byte b) {
        System.out.println("byte = " + b);
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);

        System.out.println("\n");
        foo(5);
    }
}
