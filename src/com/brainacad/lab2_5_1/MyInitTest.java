package com.brainacad.lab2_5_1;

/**
 * Created by User on 15/09/2016.
 */
public class MyInitTest {

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest() {
        System.out.println("constructor 1");
    }

    public MyInitTest(int n) {
        this();
        System.out.println("constructor 2");
    }


    public static void main(String[] args) {
        MyInitTest object = new MyInitTest(5);
    }
}