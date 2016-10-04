package com.brainacad.lab2_14_1;

/**
 * Created by User on 04/10/2016.
 */
public class Main {

    public static void main(String[] args) {
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("Hello", 55, 1256L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(25.0,"Hello", "Java");

        System.out.println(myTuple1.getA() + "  " + myTuple1.getB() + " " + myTuple1.getC());
        System.out.println(myTuple2.getA() + "  " + myTuple2.getB() + " " + myTuple2.getC());
    }

}
