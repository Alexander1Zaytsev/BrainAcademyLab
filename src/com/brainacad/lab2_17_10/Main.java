package com.brainacad.lab2_17_10;

/**
 * Created by Alexander on 10/24/2016.
 */
public class Main {

    public static void main(String[] args) {

        MyObject myObject1 = new MyObject("Lock 1");
        MyObject myObject2 = new MyObject("Lock 2");
        MyObject myObject3 = new MyObject("Lock 3");

        new MyThread("Thread 1",myObject1, myObject2).start();
        new MyThread("Thread 2",myObject2, myObject3).start();
        new MyThread("Thread 3",myObject3, myObject1).start();
    }
}
