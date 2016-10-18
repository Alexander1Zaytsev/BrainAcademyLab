package com.brainacad.testcheck;

/**
 * Created by Alexander on 10/14/2016.
 */
public class Test {
    static void foo(byte b) {
        System.out.println("byte");
    }
    static void foo(int i) {
        System.out.println("int");
    }
    public static void main(String[] args) {
        foo((byte)5);
    }
}