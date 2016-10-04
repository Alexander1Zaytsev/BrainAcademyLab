package com.brainacad.lab2_14_1;

/**
 * Created by User on 04/10/2016.
 */
public class MyTuple<A,B,C> {

    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
