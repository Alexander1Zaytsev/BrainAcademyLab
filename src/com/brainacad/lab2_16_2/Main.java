package com.brainacad.lab2_16_2;

/**
 * Created by User on 13/10/2016.
 */
public class Main {

    static void foo(int i){
        System.out.println("int " + i);
    }

    static void foo(Byte b){
        System.out.println("Byte " + b);
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);
    }
}
