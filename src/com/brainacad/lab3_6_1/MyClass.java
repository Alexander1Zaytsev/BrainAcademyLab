package com.brainacad.lab3_6_1;

/**
 * Created by Alexander on 11/17/2016.
 */
public class MyClass {

    public int a;
    private int b;
    protected int c;
    int d;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public MyClass() {

    }

    public MyClass(int a) {
        this.a = a;
    }

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
